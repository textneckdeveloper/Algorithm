import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int[][] arr = new int[n][n];
    	int[][] sum = new int[n][n+1];
    	for (int i=0; i<n; i++) {
    		StringTokenizer stArr = new StringTokenizer(br.readLine());
    		for (int j=0; j<n; j++) {	
    			arr[i][j] = Integer.parseInt(stArr.nextToken());
    			sum[i][j+1] = sum[i][j] + arr[i][j];
    		}
    	}
    	for (int i=0; i<m; i++) {
    		StringTokenizer stXY = new StringTokenizer(br.readLine());
    		int x1 = Integer.parseInt(stXY.nextToken());
    		int y1 = Integer.parseInt(stXY.nextToken());
    		int x2 = Integer.parseInt(stXY.nextToken());
    		int y2 = Integer.parseInt(stXY.nextToken());
    		int val = 0;
    		for (int j=x1; j<=x2; j++) {
    			val += (sum[(j)-1][y2] - sum[(j)-1][(y1)-1]);
    		}
    		pw.println(val);
    	}
    	
    	pw.flush();
    	br.close();
    	pw.close();
    }
}