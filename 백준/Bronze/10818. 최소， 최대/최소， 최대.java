import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        int count = 0;
        
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        while(st.hasMoreTokens()){
            arr[count++] = Integer.parseInt(st.nextToken());
        }
        
        bw.write(Arrays.stream(arr).min().orElse(0) + " " + Arrays.stream(arr).max().orElse(0));
        
        bw.flush();
        br.close();
        bw.close();
        
    }
}