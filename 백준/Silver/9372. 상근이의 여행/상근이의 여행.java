import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int count=1; count<=T; count++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int n = Integer.parseInt(st.nextToken());
    		int m = Integer.parseInt(st.nextToken());
    		for (int i=0; i<m; i++) {
    			StringTokenizer trash = new StringTokenizer(br.readLine());
    		}
    		pw.println(n-1);
    	}
    	
    	pw.flush();
    	br.close();
    	pw.close();
    }
}