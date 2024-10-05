import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	
    	long[][] D = new long[30][30];
    	for (int i=0; i<=29; i++) {
    		D[i][1] = i; D[i][0] = 1; D[i][i] = 1;
    	}
    	for (int i=2; i<=29; i++) {
    		for(int j=1; j<i; j++) D[i][j] = D[i-1][j] + D[i-1][j-1];
    	} int t = Integer.parseInt(br.readLine());
    	for (int i=0; i<t; i++) { StringTokenizer st = new StringTokenizer(br.readLine());
    		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    		pw.println(D[m][n]);
    	} pw.flush(); pw.close(); br.close();
    }
}