import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[] visited;
	static List<Edge>[] graph;
	static int maxDistance = 0;
	static int maxNode = 0;

	static class Edge {
		int w, cost;
		Edge (int w, int cost) {
			this.w = w; this.cost = cost;
		}
	}
	
	static void dfs(int node, int distance) {
		visited[node] = true;
		if (distance > maxDistance) {
			maxDistance = distance;
			maxNode = node;
		}
		for (Edge e : graph[node]) if (!visited[e.w]) dfs(e.w, distance + e.cost);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		graph = new ArrayList[n+1];
		for (int i=0; i<=n; i++) graph[i] = new ArrayList<>();
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			while (true) {
				int w = Integer.parseInt(st.nextToken());
				if (w == -1) break;
				int cost = Integer.parseInt(st.nextToken());
				graph[v].add(new Edge(w, cost));
				graph[w].add(new Edge(v, cost));
			}
		} 
		visited = new boolean[n+1]; dfs(1, 0);
		visited = new boolean[n+1]; maxDistance = 0; dfs(maxNode, 0);
		System.out.print(maxDistance);
	}
    
}