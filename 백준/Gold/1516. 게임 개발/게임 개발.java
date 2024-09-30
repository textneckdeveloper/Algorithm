import java.io.*;
import java.util.*;

public class Main {
	
	static List<Integer> graph[];
	static int[] time;
	static PrintWriter pw;
	
	static void topologicalSort(int n) {
		int[] inDegree = new int[n+1];
		for (int i=1; i<=n; i++) for (int j : graph[i]) inDegree[j]++;
		Queue<Integer> queue = new LinkedList<>();
		for (int i=1; i<=n; i++) if (inDegree[i] == 0) queue.add(i);
		int[] result = new int[n+1];
		while (!queue.isEmpty()) {
			int node = queue.poll();
			for (int i : graph[node]) {
				inDegree[i]--;
				result[i] = Math.max(result[i], result[node] + time[node]);
				if (inDegree[i] == 0) queue.add(i);
			}
		} for (int i=1; i<=n; i++) pw.println(result[i] + time[i]);
	}

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	pw = new PrintWriter(System.out);
    	int n = Integer.parseInt(br.readLine());
    	graph = new ArrayList[n+1];
    	for (int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();
		time = new int[n+1];
    	for (int i=1; i<=n; i++) { StringTokenizer st = new StringTokenizer(br.readLine());
    		time[i] = Integer.parseInt(st.nextToken());
    		while (true) {
    			int val = Integer.parseInt(st.nextToken());
    			if (val == -1) break;
    			graph[val].add(i);
    		}
    	} topologicalSort(n);
    	pw.flush(); pw.close(); br.close();
    }
    
}