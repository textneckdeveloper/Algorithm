import java.io.*;
import java.util.*;

public class Main {
	
	static int INF = 1000000000;
	static PrintWriter pw = new PrintWriter(System.out);
	
	static void floyd(int[][] graph, int n) {
		for (int k=1; k<=n; k++) {
			for (int i=1; i<=n; i++) {
				for (int j=1; j<=n; j++) {
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
				}
			}
		}
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if (graph[i][j] == INF) pw.print(0 + " ");
				else pw.print(graph[i][j] + " ");
			}
			pw.println();
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int m = Integer.parseInt(br.readLine());
    	int[][] graph = new int[n+1][n+1];
    	
    	for (int i=0; i<graph.length; i++) {
    		for (int j=0; j<graph.length; j++) {
    			if (i == j) continue;
    			graph[i][j] = INF;
    		}
    	}
    	
    	for (int i=0; i<m; i++) { StringTokenizer st = new StringTokenizer(br.readLine());
    		int v = Integer.parseInt(st.nextToken());
    		int w = Integer.parseInt(st.nextToken());
    		int cost = Integer.parseInt(st.nextToken());
    		graph[v][w] = Math.min(graph[v][w], cost);
    	} floyd(graph, n);
    	pw.flush(); pw.close(); br.close();
    }
}