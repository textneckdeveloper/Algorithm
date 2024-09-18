import java.io.*;
import java.util.*;

public class Main {
	
	static int count = 1;
	static boolean check = false;
	
	static void dfs(List<LinkedList<Integer>> graph, boolean[] visited, int node, int depth) {
		if (depth == 5) {
			check = true;
			return;
		}
		visited[node] = true;
		LinkedList<Integer> neighbors = graph.get(node);
		for (int neighbor : neighbors) {
			if (!visited[neighbor]) dfs(graph, visited, neighbor, depth+1);
		}
		visited[node] = false;
	}
	
	static void putEdge(List<LinkedList<Integer>> graph, int x, int y) {
		graph.get(x).add(y);
		graph.get(y).add(x);
	} 

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	
    	List<LinkedList<Integer>> graph = new LinkedList<>();
    	for (int i=0; i<=n; i++) graph.add(new LinkedList<>());
    	for (int i=1; i<=m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
    		putEdge(graph, x, y);
    	}
    	
    	for (int i=0; i<n; i++) {
        	boolean[] visited = new boolean[n];
        	dfs(graph, visited, i, 1);
        	if (check) break;
    	}
    	System.out.print(check ? 1 : 0);
    }
}