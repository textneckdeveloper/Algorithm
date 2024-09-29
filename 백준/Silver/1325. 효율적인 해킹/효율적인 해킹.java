import java.io.*;
import java.util.*;

public class Main {
	
	static int bfs(int start, List<Integer>[] graph) {
		boolean[] visited = new boolean[graph.length];
		Queue<Integer> queue = new LinkedList<>();
		int count = 0;
		
		queue.offer(start);
		visited[start] = true;
		
		while (!queue.isEmpty()) {
			int node = queue.poll();
			count++;
			
			for (int neighbor : graph[node]) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.offer(neighbor);
				}
			}
		} return count;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	List<Integer>[] graph = new ArrayList[n+1];
    	for (int i=0; i<=n; i++) graph[i] = new ArrayList<>();
    	for (int i=1; i<=m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
    		graph[b].add(a);
    	} int[] computer = new int[n+1]; int maxCount = 0;
    	for (int i=1; i<=n; i++) {
    		computer[i] = bfs(i, graph);
    		maxCount = Math.max(maxCount, computer[i]);
    	}
        for (int i = 1; i <= n; i++) {
            if (computer[i] == maxCount) pw.print(i + " ");
        } pw.flush(); pw.close(); br.close();

    }
}