import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
    	int[] money = new int[n]; int count = 0;
    	for (int i=0; i<n; i++) money[i] = Integer.parseInt(br.readLine());
    	for (int i=n-1; i>=0; i--) {
    		while (k/money[i] != 0) {
    			count += k/money[i];
    			k -= money[i] * (k/money[i]);
    		}
    	} System.out.print(count);
    }
}