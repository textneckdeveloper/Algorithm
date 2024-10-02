import java.io.*;
import java.util.*;

public class Main {
	
	static class Edge {
		int v, w, cost;
		
		Edge(int v, int w, int cost) {
			this.v = v;
			this.w = w;
			this.cost = cost;
		}
	}
	
	static ArrayList<Edge> graph = new ArrayList<>();
	static PrintWriter pw = new PrintWriter(System.out);
	static int INF = 1000000000;
	
	static void BellmanFord(int n, int m, int start) {
		long[] dist = new long[n+1];
		Arrays.fill(dist, INF);
		dist[start] = 0;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				Edge edge = graph.get(j);
				if (dist[edge.v] != INF && dist[edge.w] > dist[edge.v] + edge.cost) {
					dist[edge.w] = dist[edge.v] + edge.cost;
				}
			}
		}
		
		for (int i=0; i<m; i++) {
			Edge edge = graph.get(i);
			if (dist[edge.v] != INF && dist[edge.w] > dist[edge.v] + edge.cost) {
				pw.println(-1);
				return;
			}
		}
		for (int i=2; i<dist.length; i++) {
			if (dist[i] == INF) pw.println(-1);
			else pw.println(dist[i]);
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	for (int i=0; i<m; i++) { st = new StringTokenizer(br.readLine());
    		int v = Integer.parseInt(st.nextToken());
    		int w = Integer.parseInt(st.nextToken());
    		int cost = Integer.parseInt(st.nextToken());
    		graph.add(new Edge(v, w, cost));
    	} BellmanFord(n, m, 1);
    	pw.flush(); pw.close(); br.close();
    }
}