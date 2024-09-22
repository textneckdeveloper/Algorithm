import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	boolean checkBool = true;
    	int count = 0;
    	for (int i=1; i<=n; i++) {
    		checkBool = true;
    		int check = Integer.parseInt(st.nextToken());
    		if (check == 1) continue;
    		for (int j=2; j*j<=check; j++) {
    			if (check % j == 0) {
    				checkBool = false;
    			}
    		}
    		if (checkBool) count++; 
    	} System.out.print(count);
    }
}