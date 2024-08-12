import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=T; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
            bw.newLine();
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}