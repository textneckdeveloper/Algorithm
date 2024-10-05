import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int m = Integer.parseInt(br.readLine());
    	int[] n = new int[m];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int sum = 0;
    	for (int i=0; i<m; i++) {
    		n[i] = Integer.parseInt(st.nextToken());
    		sum += n[i];
    	}
    	
    	int k = Integer.parseInt(br.readLine());
    	double[] arr = new double[m];
    	for (int i=0; i<m; i++) arr[i] = 1.0;
    	for (int i=0; i<m; i++) {
	    	for (int j=1; j<=k; j++) {
	    		arr[i] *= n[i]/(double)sum;
	    		n[i]--;
	    		sum--;
	    	} for(int j=1; j<=k; j++) sum++;
    	} double answer = 0;
    	for (double d : arr) answer += d;
    	System.out.print(answer);
    }
}