import java.io.*;
import java.util.*;

public class Main {
	
	static ArrayList<Integer>[] graph;
	static int count = 1;
	static boolean check = false;
	static boolean visited[];
	
	static void dfs(int node, int depth) {
		if (depth == 5) {
			check = true;
			return;
		}
		visited[node] = true;
		for (int i : graph[node]) {
			if (!visited[i]) dfs(i, depth+1);
		}
		visited[node] = false;
	}
	
	static void putEdge(ArrayList<Integer>[] graph, int x, int y) {
		graph[x].add(y);
		graph[y].add(x);
	} 

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	
    	graph = new ArrayList[n];
    	for (int i=0; i<n; i++) graph[i] = new ArrayList<>();
    	for (int i=1; i<=m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
    		putEdge(graph, x, y);
    	}
    	visited = new boolean[n];
    	for (int i=0; i<n; i++) {
        	dfs(i, 1);
        	if (check) break;
    	}
    	System.out.print(check ? 1 : 0);
    }
}