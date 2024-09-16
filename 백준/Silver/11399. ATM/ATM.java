import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int[] A = new int[n];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i=0; i<n; i++) A[i] = Integer.parseInt(st.nextToken());
    	Arrays.sort(A);
    	int sum = 0;
    	for (int i=0; i<n; i++) {
    		for (int j=0; j<=i; j++) sum += A[j];
    	}
    	System.out.print(sum);
    }
}