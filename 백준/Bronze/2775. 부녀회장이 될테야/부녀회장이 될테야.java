import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	int t = Integer.parseInt(br.readLine());
    	for (int test=0; test<t; test++) {
    		int k = Integer.parseInt(br.readLine());
    		int n = Integer.parseInt(br.readLine());
    		int[][] D = new int[k+1][n+1];
    		for (int i=1; i<=n; i++) D[0][i] = i;
    		for (int i=1; i<=k; i++) D[i][1] = 1;
    		for (int i=1; i<=k; i++) {
    			for (int j=2; j<=n; j++) D[i][j] = D[i][j-1] + D[i-1][j];
    		} pw.println(D[k][n]);
    	} pw.flush(); pw.close(); br.close();
    }
}