import java.io.*;
import java.util.*;

public class Main {
	
	static class Node implements Comparable<Node>{
		long start, end;
		
		Node(long start, long end) {
			this.start = start;
			this.end = end;
		}
		
		public int compareTo(Node o) {
			if (this.end == o.end) return Long.compare(this.start, o.start);
			return Long.compare(this.end, o.end);
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	Node[] A = new Node[n]; Stack<Node> stack = new Stack<>();
    	for (int i=0; i<n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
    		A[i] = new Node(a, b);
    	} Arrays.sort(A);
    	for (int i=0; i<n; i++) {
    		if (stack.isEmpty()) stack.push(A[i]);
    		else {
    			if (A[i].start >= stack.peek().end) stack.push(A[i]);
    		}
    	} System.out.print(stack.size());
    	br.close();
    }
    
}