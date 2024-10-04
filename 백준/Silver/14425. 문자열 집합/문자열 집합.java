import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	String[] sn = new String[n]; String[] sm = new String[m];
    	for (int i=0; i<n; i++) sn[i] = br.readLine();
    	for (int i=0; i<m; i++) sm[i] = br.readLine();
    	
    	int count = 0;
    	for (int i=0; i<m; i++) {
    		for (int j=0; j<n; j++) {
    			if (sm[i].equals(sn[j])) {
    				count++;
    				break;
    			}
    		}
    	} System.out.print(count);
    }
}