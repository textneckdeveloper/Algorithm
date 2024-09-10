import java.io.*;
import java.util.*;

public class Main {
    
    static class Edge implements Comparable<Edge> {
		int w, cost;
		
		Edge(int w, int cost) {
			this.w = w;
			this.cost = cost;
		}
		
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}
	
	static List<Edge>[] graph;
	
	static void prim(int start, int n) {
		boolean[] visited = new boolean[n+1];
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		
		pq.offer(new Edge(start, 0));
		int total = 0;
		
		while (!pq.isEmpty()) {
			Edge edge = pq.poll();
			int v = edge.w;
			int cost = edge.cost;
			
			if (visited[v]) continue;
			
			visited[v] = true;
			total += cost;
			
			for (Edge e : graph[v]) {
				if (!visited[e.w]) {
					pq.add(e);
				}
			}
		}
		System.out.print(total);
	}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	graph = new ArrayList[n+1];
    	
    	for (int i=0; i<graph.length; i++) {
    		graph[i] = new ArrayList<>();
    	}
    	
    	for (int i=0; i<m; i++) {
    		StringTokenizer st2 = new StringTokenizer(br.readLine());
    		int v = Integer.parseInt(st2.nextToken());
    		int w = Integer.parseInt(st2.nextToken());
    		int cost = Integer.parseInt(st2.nextToken());
    		
    		graph[v].add(new Edge(w, cost));
    		graph[w].add(new Edge(v, cost));
    	}
    	
    	prim(1, n);
    }
}