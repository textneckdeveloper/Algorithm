import java.io.*;
import java.util.*;

public class Main {
	
	static class Node implements Comparable<Node>{
		int w, cost;
		
		Node(int w, int cost) {
			this.w = w;
			this.cost = cost;
		}
		
		public int compareTo(Node o) {
			return Integer.compare(this.cost, o.cost);
		}
	}
	
	static ArrayList<Node>[] graph;
	
	static void Dijkstra(int start, int end, int n) {
		boolean[] visited = new boolean[n+1];
		int[] dist = new int[n+1];
		int INF = Integer.MAX_VALUE;
		Arrays.fill(dist, INF);
		dist[start] = 0;
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		
		while (!pq.isEmpty()) {
			int node = pq.poll().w;
			
			if (visited[node]) continue;
			visited[node] = true;
			
			for (Node nd : graph[node]) {
				if (dist[nd.w] > dist[node] + nd.cost) {
					dist[nd.w] = dist[node] + nd.cost;
					pq.offer(new Node(nd.w, dist[nd.w]));
				}
			}
		} System.out.print(dist[end]);
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
    	graph = new ArrayList[n+1];
    	for (int i=0; i<=n; i++) graph[i] = new ArrayList<>();
    	for (int i=0; i<m; i++) { StringTokenizer st = new StringTokenizer(br.readLine());
    		int v = Integer.parseInt(st.nextToken());
    		int w = Integer.parseInt(st.nextToken());
    		int cost = Integer.parseInt(st.nextToken());
    		graph[v].add(new Node(w, cost));
    	} StringTokenizer st = new StringTokenizer(br.readLine());
    	int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
    	Dijkstra(start, end, n);
    }
}