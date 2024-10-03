import java.io.*;
import java.util.*;

public class Main {
	
	static PrintWriter pw = new PrintWriter(System.out);
	
	static void floyd(int[][] graph, int n) {
		for (int k=1; k<=n; k++) {
			for (int i=1; i<=n; i++) {
				for (int j=1; j<=n; j++) {
					if (graph[i][k] == 1 && graph[k][j] == 1) graph[i][j] = 1;
				}
			}
		}
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) pw.print(graph[i][j] + " ");
			pw.println();
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int[][] graph = new int[n+1][n+1];
    	
    	for (int i=1; i<=n; i++) { StringTokenizer st = new StringTokenizer(br.readLine());
    		for (int j=1; j<=n; j++) {
    			graph[i][j] = Integer.parseInt(st.nextToken());
    		}
    	} floyd(graph, n);
    	pw.flush(); pw.close(); br.close();
    }
}