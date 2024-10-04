import java.io.*;
import java.util.*;

public class Main {
	
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int root = 0;
	static int result = 0;
	
	static void DFS(int node) {
		visited[node] = true;
		int count = 0;
		
		for (int i : graph[node]) {
			if (!visited[i]) {
				count++;
				DFS(i);
			} 
		}
		if (count == 0) result++;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	graph = new ArrayList[n];
    	for (int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();
    	visited = new boolean[n];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i=0; i<n; i++) {
    		int x = Integer.parseInt(st.nextToken());
    		if (x != -1) {
        		graph[i].add(x);
        		graph[x].add(i);
    		}
    		else root = i;
    	} int del = Integer.parseInt(br.readLine());
    	visited[del] = true;
    	
    	DFS(root);
    	
    	if (root != del) System.out.print(result);
    	else System.out.print(0);
    }
}