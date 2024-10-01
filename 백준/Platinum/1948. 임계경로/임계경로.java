import java.io.*;
import java.util.*;

public class Main {
	
	static ArrayList<Node>[] graph;
	
	static class Node {
		int w, cost;
		
		Node(int w, int cost) {
			this.w = w;
			this.cost = cost;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
    	ArrayList<ArrayList<Node>> A = new ArrayList<>();
    	ArrayList<ArrayList<Node>> reverseA = new ArrayList<>();
    	for (int i=0; i<=n; i++) {
    		A.add(new ArrayList<>());
    		reverseA.add(new ArrayList<>());
    	} int[] inDegree = new int[n+1];
    	for (int i=0; i<m; i++) { StringTokenizer st = new StringTokenizer(br.readLine());
    		int s = Integer.parseInt(st.nextToken());
    		int e = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		A.get(s).add(new Node(e, v));
    		reverseA.get(e).add(new Node(s, v));
    		inDegree[e]++;
    	} StringTokenizer st = new StringTokenizer(br.readLine());
    	int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
    	
    	Queue<Integer> queue = new LinkedList<>();
    	queue.offer(start);
    	int[] result = new int[n+1];
    	while(!queue.isEmpty()) {
    		int node = queue.poll();
    		for (Node nd : A.get(node)) {
    			inDegree[nd.w]--;
    			result[nd.w] = Math.max(result[nd.w], result[node] + nd.cost);
    			if (inDegree[nd.w] == 0) {
    				queue.offer(nd.w);
    			}
    		}
    	}
    	
    	int resultCount = 0;
    	boolean  visited[] = new boolean[n+1];
    	queue = new LinkedList<>();
    	queue.offer(end);
    	visited[end] = true;
    	while (!queue.isEmpty()) {
    		int node = queue.poll();
    		for (Node nd : reverseA.get(node)) {
    			if (result[nd.w] + nd.cost == result[node]) {
    				resultCount++;
    				if (visited[nd.w] == false) {
    					visited[nd.w] = true;
    					queue.offer(nd.w);
    				}
    			}
    		}
    	} System.out.println(result[end]); System.out.print(resultCount);
    }
    
}