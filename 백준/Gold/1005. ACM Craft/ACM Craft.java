import java.io.*;
import java.util.*;

public class Main {
    
    static class Node {
		int w;
		int cost;
		
		Node(int w, int cost) {
			this.w = w;
			this.cost = cost;
		}
	}
	
	static int[] time;
	static int[] totalTime;
	
	static int topologicalSort(int n, List<List<Node>> adj, int win) {
		int[] inDegree = new int[n+1];
		int max = 0;
		
		for (int i=1; i<=n; i++) {
			for (Node node : adj.get(i)) {
				inDegree[node.w]++;
			}
		}
		
		Queue<Integer> queue = new LinkedList<>();
		totalTime = new int[n + 1];
		
		for (int i=1; i<=n; i++) {
			if (inDegree[i] == 0) {
				queue.add(i);
				totalTime[i] = time[i];
			}
		}
		
		while (!queue.isEmpty()) {
			int node = queue.poll();
			
			if (node == win) {
				return totalTime[node];
			}
			
			max = 0;
			for (Node nd : adj.get(node)) {
				inDegree[nd.w]--;
				if (inDegree[nd.w] == 0) {
					queue.add(nd.w);
				}
				totalTime[nd.w] = Math.max(totalTime[nd.w], totalTime[node] + time[nd.w]);
			}
		}
			
		return -1;
	}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int count=1; count<=T; count++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int n = Integer.parseInt(st.nextToken());
    		int k = Integer.parseInt(st.nextToken());
    		
    		StringTokenizer st2 = new StringTokenizer(br.readLine());
    		
    		time = new int[n+1];
    		for (int i=0; i<=n; i++) {
    			if (i==0) time[0] = 0;
    			else time[i] = Integer.parseInt(st2.nextToken());
    		}
    		
    		List<List<Node>> adj = new ArrayList<>();
    		for (int i=0; i<=n; i++) {
    			adj.add(new ArrayList<>());
    		}
    		for (int i=0; i<k; i++) {
    			StringTokenizer st3 = new StringTokenizer(br.readLine());
    			int v = Integer.parseInt(st3.nextToken());
    			int w = Integer.parseInt(st3.nextToken());
    			adj.get(v).add(new Node(w, time[w]));
    		}
    		
    		int win = Integer.parseInt(br.readLine());
    		
    		int result = topologicalSort(n, adj, win);
    		
    		System.out.println(result);
        }
    }
    
}