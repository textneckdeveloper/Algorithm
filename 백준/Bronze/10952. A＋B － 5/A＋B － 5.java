import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int a = -1;
        int b = -1;
        
        while(a != 0 && b != 0){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a != 0 && b != 0) {
            	pw.println(a+b);
            }
        }
        
        pw.flush();
        br.close();
        pw.close();
    }
}