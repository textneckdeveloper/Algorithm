import java.io.*;
import java.util.*;

public class Main {
	
	static List<Node> graph;
	static int[] parent;
	static int sum = 0;
	
	static class Node implements Comparable<Node> {
		int s, e, cost;
		
		Node(int s, int e, int cost) {
			this.s = s;
			this.e = e;
			this.cost = cost;
		}
		
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}
	
	static void union(int a, int b) {
		a = find(a);
		b = find(b);
		
		if (a < b) parent[b] = a;
		else parent[a] = b;
	}
	
	static int find(int a) {
		if (parent[a] == a) return a;
		else return parent[a] = find(parent[a]);
	}
	
	static int[] kruskal(List<Node> graph) {
		int cost = 0;
		int usedEdges = 0;
		
		for (Node node : graph) {
			if (find(node.s) != find(node.e)) {
				cost += node.cost;
				union(node.s, node.e);
				usedEdges++;
			}
		} int[] arr = {sum-cost, usedEdges}; 
		return arr;
	}
	
	static int check(char c) {
		if (c >= 'a' && c <= 'z') return c - 'a' + 1;
		else if (c >= 'A' && c <= 'Z') return c - 'A' + 27;
		else return 0;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	graph = new ArrayList<>();
    	
    	for (int i=0; i<n; i++) { 
    		String s = br.readLine();
    		for (int j=0; j<n; j++) {
        		int val = check(s.charAt(j));
        		sum += val;
        		if (val != 0) graph.add(new Node(i, j, val));
    		}
    	}
    	
    	Collections.sort(graph);
    	
    	parent = new int[n];
    	for (int i=0; i<parent.length; i++) parent[i] = i;
    	
    	int[] result = kruskal(graph);
    	if (result[1] == n-1) System.out.print(result[0]);
    	else System.out.print(-1);
    }
}