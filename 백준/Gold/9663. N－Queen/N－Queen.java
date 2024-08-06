import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main{
    
    static int count = 0;
    static int[] queen;
    
    static boolean[] check_a;
    static boolean[] check_b;
    static boolean[] check_c;
    
    static void set(int i, int N){
        
        for(int j=0; j<N; j++){
            if(check_a[j] == false && check_b[i+j] == false && check_c[i-j+(N-1)] == false){
                queen[i] = j;
                if(i == N-1){
                    count++;
                }
                else{
                    check_a[j] = check_b[i+j] = check_c[i-j+(N-1)] = true;
                    set(i+1, N);
                    check_a[j] = check_b[i+j] = check_c[i-j+(N-1)] = false;
                }
            }
        }
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = Integer.parseInt(br.readLine());
        
        queen = new int[N];
        
        check_a = new boolean[N];
        check_b = new boolean[N*2-1];
        check_c = new boolean[N*2-1];
        
        set(0, N);
        
        pw.print(count);
        
        pw.flush();
        br.close();
        pw.close();
        
    }
}