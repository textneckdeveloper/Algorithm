import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] A = new int[n];
    	for (int i=0; i<n; i++) A[i] = Integer.parseInt(st.nextToken());
    	
    	int[] L = new int[n];
    	L[0] = A[0];
    	int answer = L[0];
    	for (int i=1; i<n; i++) {
    		L[i] = Math.max(A[i], L[i-1] + A[i]);
    		answer = Math.max(answer, L[i]);
    	}
    	
    	int[] R = new int[n];
    	R[n-1] = A[n-1];
    	for (int i=n-2; i>=0; i--) R[i] = Math.max(A[i], R[i+1] + A[i]);
    	
    	for (int i=1; i<n-1; i++) {
    		int temp = L[i-1] + R[i+1];
    		answer = (Math.max(answer, temp));
    	} System.out.print(answer);
    }
}