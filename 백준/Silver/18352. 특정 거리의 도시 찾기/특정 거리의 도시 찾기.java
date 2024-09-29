import java.io.*;
import java.util.*;

public class Main {
	
	static class Node implements Comparable<Node> {
		int index, cost;
		
		Node(int index, int cost) {
			this.index = index;
			this.cost = cost;
		}
		
		public int compareTo(Node o) {
			return Integer.compare(this.cost, o.cost);
		}
	}
	
	static ArrayList<Node> graph[];
	static PrintWriter pw;
	
	static void Dijkstra(int start, int n, int k) {
		boolean[] check = new boolean[n+1];
		int[] dist = new int[n+1];
		int INF = Integer.MAX_VALUE;
		Arrays.fill(dist, INF);
		dist[start] = 0;
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		
		while (!pq.isEmpty()) {
			int nowVertex = pq.poll().index;
			
			if (check[nowVertex]) continue;
			check[nowVertex] = true;
			
			for (Node next : graph[nowVertex]) {
				if (dist[next.index] > dist[nowVertex] + next.cost) {
					dist[next.index] = dist[nowVertex] + next.cost;
					pq.offer(new Node(next.index, dist[next.index]));
				}
			}
		}
		
		boolean noVal = false;
		
		for (int i=1; i<dist.length; i++) {
			if (dist[i] == k) {
				pw.println(i);
				noVal = true;
			}
			else if (i == dist.length-1 && noVal == false) pw.println(-1);
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	pw = new PrintWriter(System.out);
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
    	graph = new ArrayList[n+1];
    	for (int i=0; i<=n; i++) graph[i] = new ArrayList<>();
    	for (int i=1; i<=m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
    		graph[a].add(new Node(b, 1));
    	} Dijkstra(x, n, k);
    	pw.flush(); pw.close(); br.close();
    }
}