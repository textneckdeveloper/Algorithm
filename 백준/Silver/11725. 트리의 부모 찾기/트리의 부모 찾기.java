import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<Integer>[] graph;
	static int[] result;
	static boolean[] visited;
	
	static void DFS(int node) {

		visited[node] = true;
		
		for (int i : graph[node]) {
			if (!visited[i]) {
				result[i] = node;
				DFS(i);
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	int n = Integer.parseInt(br.readLine());
    	
    	graph = new ArrayList[n+1];
    	for (int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();
    	visited = new boolean[graph.length];
    	
    	result = new int[n+1];
    	
    	for (int i=0; i<n-1; i++) { StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		graph[a].add(b);
    		graph[b].add(a);
    	} DFS(1);
    	for (int i=2; i<result.length; i++) pw.println(result[i]);
    	pw.flush(); pw.close(); br.close();
    }
}