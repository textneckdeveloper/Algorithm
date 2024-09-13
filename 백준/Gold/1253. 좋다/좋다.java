import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] A = new int[n];
    	for (int i=0; i<n; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	if (n <= 2) {
    		System.out.print(0);
    		return;
    	}
    	
        Arrays.sort(A);
        
    	int a, b, count = 0;
    	for (int i=0; i<n; i++) {
    		a=0; b=n-1;
    		while (a < b) {
        		if (a == i) {
        			a++; continue;
        		}
        		if (b == i) {
        			b--; continue;
        		}
    			if (A[a] + A[b] < A[i]) {
    				a++;
    			}
    			else if (A[a] + A[b] > A[i]) {
    				b--;
    			}
    			else {
    				count++;
        			break;
    			}
    		}
    	}
    	System.out.print(count);
    }
}