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
	static PriorityQueue<Integer>[] dist;
	static int n, m, k;
	
	static void Dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		dist[start].offer(0);
		
		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int w = node.w;
			int cost = node.cost;
			
			for (Node nd : graph[w]) {
				int ndCost = cost + nd.cost;
				if (dist[nd.w].size() < k) {
					dist[nd.w].offer(ndCost);
					pq.offer(new Node(nd.w, ndCost));
				}
				else if (dist[nd.w].peek() > ndCost) {
					dist[nd.w].poll();
					dist[nd.w].offer(ndCost);
					pq.offer(new Node(nd.w, ndCost));
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	k = Integer.parseInt(st.nextToken());
    	
    	graph = new ArrayList[n+1];
    	for (int i=0; i<=n; i++) graph[i] = new ArrayList<>();
    	
    	for (int i=0; i<m; i++) { st = new StringTokenizer(br.readLine());
    		int v = Integer.parseInt(st.nextToken());
    		int w = Integer.parseInt(st.nextToken());
    		int cost = Integer.parseInt(st.nextToken());
    		graph[v].add(new Node(w, cost));
    	}
    	
    	dist = new PriorityQueue[n+1];
    	for (int i=0; i<=n; i++) {
    		dist[i] = new PriorityQueue<>(Collections.reverseOrder());
    	} Dijkstra(1);
    	
    	for (int i=1; i<=n; i++) {
    		if (dist[i].size() == k) pw.println(dist[i].peek());
    		else pw.println(-1);
    	} pw.flush(); pw.close(); br.close();
    }
}