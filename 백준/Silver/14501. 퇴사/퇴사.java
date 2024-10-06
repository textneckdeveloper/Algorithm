import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	int[] dp = new int[n+2];

    	int[][] date = new int[n+1][2];
    	
    	for (int i=1; i<=n; i++) { StringTokenizer st = new StringTokenizer(br.readLine());
    		date[i][0] = Integer.parseInt(st.nextToken());
    		date[i][1] = Integer.parseInt(st.nextToken());
    	}
    	for (int i=n; i>0; i--) {
    		int time = date[i][0] + i;
    		if (time <= n+1) dp[i] = Math.max(dp[i+1], dp[time] + date[i][1]);
    		else dp[i] = dp[i+1];
    	} System.out.print(dp[1]);
    }
}