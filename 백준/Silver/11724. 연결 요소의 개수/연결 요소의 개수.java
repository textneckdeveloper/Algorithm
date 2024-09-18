import java.io.*;
import java.util.*;

public class Main {
	
	static void bfs(int[][] graph, boolean[] visited, int start) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(start);
		visited[start] = true;
			
		while (!queue.isEmpty()) {
			int node = queue.poll();
			for (int i=1; i<graph.length; i++) {
				if (graph[node][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int[][] graph = new int[n+1][n+1];
    	boolean[] visited = new boolean[n+1];
    	for (int i=1; i<=m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		graph[x][y] = 1; graph[y][x] = 1;
    	}
    	
    	int count = 0;
    	for (int i=1; i<=n; i++) {
    		if (!visited[i]) {
    			bfs(graph, visited, i);
    			count++;
    		}
    	} System.out.print(count);
    }
}