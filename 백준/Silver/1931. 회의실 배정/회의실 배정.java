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
    	Node[] A = new Node[n];
    	for (int i=0; i<n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
    		A[i] = new Node(a, b);
    	} Arrays.sort(A); long endTime = 0; int count = 0;
    	for (int i=0; i<n; i++) {
    		if (A[i].start >= endTime) {
    			count++;
    			endTime = A[i].end;
    		}
    	} System.out.print(count);
    }
    
}