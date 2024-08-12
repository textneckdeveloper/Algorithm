import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        pw.print(((A+B)%C) + "\n" + (((A%C)+(B%C))%C) + "\n" + ((A*B)%C) + "\n" + ((A%C)*(B%C))%C);
        
        pw.flush();
        br.close();
        pw.close();
    }
}