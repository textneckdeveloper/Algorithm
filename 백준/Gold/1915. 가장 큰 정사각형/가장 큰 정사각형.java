import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	long[][] D = new long[n][m];
    	
    	long max = 0;
    	for (int i=0; i<n; i++) { String s = br.readLine();
    		for (int j=0; j<m; j++) {
    			D[i][j] = s.charAt(j) - '0';
    			if (D[i][j] == 1 && i>0 && j>0) {
        			D[i][j] = Math.min(D[i][j-1], Math.min(D[i-1][j], D[i-1][j-1])) + D[i][j];
    			} if (D[i][j] > max) max = D[i][j];
    		}
    	} System.out.print(max * max);
    }
}