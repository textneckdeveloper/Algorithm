import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int m = Integer.parseInt(br.readLine());
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] val = new int[n];
    	for (int i=0; i<n; i++) {
    		val[i] = Integer.parseInt(st.nextToken());
    	}
    	
        Arrays.sort(val);
    	
    	int count = 0;
    	int i = 0;
    	int j = n-1;
    	while (i < j) {
    		if (val[i] + val[j] < m) {
    			i++;
    		}
    		else if (val[i] + val[j] > m) {
    			j--;
    		}
    		else {
    			count++;
    			i++;
    			j--;
    		}
    	}
    	System.out.print(count);
    }
    
}