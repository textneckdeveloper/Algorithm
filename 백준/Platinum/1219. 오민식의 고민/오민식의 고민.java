import java.io.*;
import java.util.*;

public class Main {
	
	static class Edge {
		int from, to, cost;
		
		Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	
	static int n, m, s, e;
	static Edge edges[];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	s = Integer.parseInt(st.nextToken());
    	e = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	
    	edges = new Edge[m];
    	
    	long[] dist = new long[n];
    	Arrays.fill(dist, Long.MIN_VALUE);
    	
    	for (int i=0; i<m; i++) { st = new StringTokenizer(br.readLine());
    		int from = Integer.parseInt(st.nextToken());
    		int to = Integer.parseInt(st.nextToken());
    		int cost = Integer.parseInt(st.nextToken());
    		edges[i] = new Edge(from, to, cost);
    	} st = new StringTokenizer(br.readLine()); 
    	int[] money = new int[n];
    	for (int i=0; i<n; i++) money[i] = Integer.parseInt(st.nextToken());
    	
    	dist[s] = money[s];
    	
    	for (int i=0; i<=n+50; i++) {
    		for (int j=0; j<m; j++) {
    			int from = edges[j].from;
    			int to = edges[j].to;
    			int cost = edges[j].cost;
    			
        		if (dist[from] == Long.MIN_VALUE) continue;
        		else if (dist[from] == Long.MAX_VALUE) dist[to] = Long.MAX_VALUE;
        		else if (dist[to] < dist[from] + money[to] - cost) {
        			dist[to] = dist[from] + money[to] - cost;
        			if (i >= n-1) dist[to] = Long.MAX_VALUE;
        		}
    		}
    	}
    	if (dist[e] == Long.MIN_VALUE) System.out.print("gg");
    	else if (dist[e] == Long.MAX_VALUE) System.out.print("Gee");
    	else System.out.print(dist[e]);
    }
}