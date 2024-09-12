import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        StringTokenizer sumVal = new StringTokenizer(br.readLine());
        long[] sum = new long[n];
        long[] c = new long[m];
        for (int i=0; i<n; i++) {
            sum[i] = (i==0) ? Integer.parseInt(sumVal.nextToken()) :
                     sum[i-1] + Integer.parseInt(sumVal.nextToken()); 
        }
        long val = 0;
        for (int i=0; i<n; i++) {
            int o = (int)(sum[i] % m);
            val += (o == 0) ? 1 : 0;
            c[o]++;
        }
        
        for (int i=0; i<m; i++) {
            if (c[i] > 1) {
                val = val + (c[i]*(c[i]-1))/2;
            }
        }
        System.out.print(val);
    }
}