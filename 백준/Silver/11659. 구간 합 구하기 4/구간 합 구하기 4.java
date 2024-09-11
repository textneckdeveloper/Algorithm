import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	int[] sum = new int[n];
    	int[] arr = new int[n];
    	StringTokenizer stArr = new StringTokenizer(br.readLine());
    	for (int i=0; i<n; i++) {
    		arr[i] = Integer.parseInt(stArr.nextToken());
    		sum[i] = (i==0) ? arr[i] : sum[i-1] + arr[i];
    	}
    	
    	for (int i=0; i<m; i++) {
    		StringTokenizer st2 = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st2.nextToken());
    		int b = Integer.parseInt(st2.nextToken());
    		try {
    			pw.println(sum[b-1] - sum[a-2]);
    		} catch (Exception e) {
    			pw.println(sum[b-1]);
    		}	
    	}
    	
    	pw.flush();
    	br.close();
    	pw.close();
    }
}