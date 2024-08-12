import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int check = 0;
        
        for(int i=1; i<=N; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            check += a*b;
        }
        
        if(X == check){
            pw.print("Yes");
        }
        else{
            pw.print("No");
        }
        
        pw.flush();
        br.close();
        pw.close();
    }
}