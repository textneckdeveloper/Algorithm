import java.io.*;
import java.util.*;

public class Main {
	
	static PrintWriter pw;
	static List<Integer>[] graph;
	static int[] answer;
	
	static void topologicalSort(int n) {
		int[] inDegree = new int[n+1];
		for (int i=1; i<=n; i++) for (int j : graph[i]) inDegree[j]++;
		Queue<Integer> queue = new LinkedList<>();
		for (int i=1; i<=n; i++) if (inDegree[i] == 0) queue.add(i);
		while (!queue.isEmpty()) {
			int node = queue.poll();
			pw.print(node + " ");
			for (int i : graph[node]) {
				inDegree[i]--;
				if (inDegree[i] == 0) queue.add(i);
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	pw = new PrintWriter(System.out);
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	graph = new ArrayList[n+1]; answer = new int[n];
    	for (int i=0; i<n+1; i++) graph[i] = new ArrayList<>();
    	for (int i=1; i<=m; i++) { st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
    		graph[a].add(b);
    	} topologicalSort(n);
    	pw.flush(); pw.close(); br.close();
    }
}