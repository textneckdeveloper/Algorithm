import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] basket = new int[n];
        
        for(int i=0; i<n; i++){
            basket[i] = i+1;
        }
        
        for(int i=0; i<m; i++){
            s = br.readLine();
            StringTokenizer st2 = new StringTokenizer(s);
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int t = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = t;
        }
        
        for(int i : basket){
            bw.write(i + " ");
        }
        
        bw.flush();
        br.close();
        bw.close();
        
    }
}