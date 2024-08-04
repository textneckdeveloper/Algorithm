import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        
        Stack<Integer> stack = new Stack<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        int checkHeight = 0;
        int maxHeight = 0;
        
        for(int i=1; i<=N; i++){
            int height = Integer.parseInt(br.readLine());
            stack.push(height);
        }
        
        for(int i=1; i<=N; i++){
        	checkHeight = stack.pop();
        	if(checkHeight > maxHeight) {
        		count++;
        		maxHeight = checkHeight;
        	}
        }
        
        pw.print(count);
        
        pw.flush();
        br.close();
        pw.close();
        
    }
}