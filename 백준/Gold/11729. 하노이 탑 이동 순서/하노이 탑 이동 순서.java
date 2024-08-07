import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Stack;

public class Main{
    
    static PrintWriter pw;
    
    static class Move{
        int n, from, to, aux;
        boolean check;
        
        Move(int n, int from, int to, int aux){
            this.n = n;
            this.from = from;
            this.to = to;
            this.aux = aux;
            this.check = false;
        }
    }
    
    static void hanoi(int n){
        Stack<Move> stack = new Stack<>();
        stack.push(new Move(n, 1, 3, 2));
        
        while(!stack.isEmpty()){
            
            Move now = stack.peek();
            
            if(now.n == 0){
                stack.pop();
                continue;
            }
            
            if(!now.check){
                if(now.n>1){
                    stack.push(new Move(now.n-1, now.from, now.aux, now.to));
                }
                now.check = true;
            }
            else{
                pw.print("\n" + now.from + " " + now.to);
                stack.pop();
                if(now.n>1){
                    stack.push(new Move(now.n-1, now.aux, now.to, now.from));
                }
            }
                
        }
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);
        
        int N = Integer.parseInt(br.readLine());
        
        pw.print((int)Math.pow(2, N) - 1);
        
        hanoi(N);
        
        pw.flush();
        br.close();
        pw.close();
        
    }
}