import java.io.*;
import java.util.*;

public class Main {
	
	static ArrayList<Node>[] graph;
	static PrintWriter pw = new PrintWriter(System.out);
	
	static class Node implements Comparable<Node> {
		int index, cost;
		
		Node(int index, int cost) {
			this.index = index;
			this.cost = cost;
		}
		
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}
	
	static void Dijkstra(int start, int v) {
		boolean[] visited = new boolean[v+1];
		int[] dist = new int[v+1];
		int INF = Integer.MAX_VALUE;
		Arrays.fill(dist, INF);
		dist[start] = 0; 
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		
		while (!pq.isEmpty()) {
			int node = pq.poll().index;
			
			if (visited[node]) continue;
			visited[node] = true;
			
			for (Node nd : graph[node]) {
				if (dist[nd.index] > dist[node] + nd.cost) {
					dist[nd.index] = dist[node] + nd.cost;
					pq.offer(new Node(nd.index, dist[nd.index]));
				}
			}
		}
		for (int i=1; i<dist.length; i++) {
			if (dist[i] == INF) pw.println("INF");
			else pw.println(dist[i]);
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int v = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
    	int start = Integer.parseInt(br.readLine());
    	graph = new ArrayList[v+1];
    	for (int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();
    	for (int i=0; i<e; i++) { st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		int c = Integer.parseInt(st.nextToken());
    		graph[a].add(new Node(b, c));
    	} Dijkstra(start, v);
    	pw.flush(); pw.close(); br.close();
    }
}