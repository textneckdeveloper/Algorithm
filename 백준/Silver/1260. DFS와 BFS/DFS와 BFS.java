import java.io.*;
import java.util.*;

public class Main {
	
	static PrintWriter pw;
	static ArrayList<Integer>[] graph;
	
	static void putEdge(ArrayList<Integer>[] graph, int x, int y) {
		graph[x].add(y);
		graph[y].add(x);
	}
	
	static void dfs(ArrayList<Integer>[] graph, int start) {
		boolean[] visited = new boolean[graph.length];
		Stack<Integer> stack = new Stack<>();
		
		stack.push(start);
		
		while (!stack.isEmpty()) {
			int node = stack.pop();
			if (!visited[node]) {
				visited[node] = true;
				pw.print(node + " ");
				List<Integer> neighbors = graph[node];
				for (int i=neighbors.size()-1; i>=0; i--) {
					int neighbor = neighbors.get(i);
					if (!visited[neighbor]) {
						stack.push(neighbor);
					}
				}
			}
		} pw.println();
	}
	
	static void bfs(ArrayList<Integer>[] graph, int start) {
		boolean[] visited = new boolean[graph.length];
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(start);
		visited[start] = true;
		
		while (!queue.isEmpty()) {
			int node = queue.poll();
			pw.print(node + " ");
			for (int i : graph[node]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		} pw.println();
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	pw = new PrintWriter(System.out);
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int start = Integer.parseInt(st.nextToken());

    	graph = new ArrayList[n+1];
    	for (int i=0; i<=n; i++) graph[i] = new ArrayList<>(); 
    	for (int i=0; i<m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		putEdge(graph, x, y); 
    	} for (int i=1; i<=n; i++) Collections.sort(graph[i]);
    		
    	dfs(graph, start); bfs(graph, start);
    	pw.flush(); pw.close(); br.close();
    }
}