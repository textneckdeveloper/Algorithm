import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
    	long[] A = new long[10000001];
    	for (int i=2; i<A.length; i++) A[i] = i;
    	for (int i=2; i*i<=A.length-1; i++) {
    		if (A[i] == 0) continue; 
    		for (int j=i*i; j<=A.length-1; j+=i) A[j] = 0;
    	} int count = 0;
    	for (int i=2; i<A.length; i++) {
    		if (A[i] != 0) {
    			long tmp = A[i];
    			while ((double)A[i] <= (double)b/(double)tmp) {
    				if ((double)A[i] >= (double)a/(double)tmp) count++;
    				tmp *= A[i];
    			}
    		}
    	} System.out.print(count);
    	br.close();
    }
}