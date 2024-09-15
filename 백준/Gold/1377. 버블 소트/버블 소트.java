import java.io.*;
import java.util.Arrays;

public class Main {    
	static class Node implements Comparable<Node>{
		int value;
		int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
		
		public int compareTo(Node o) {
			return this.value - o.value;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	Node[] A = new Node[n];
    	for (int i=0; i<n; i++) A[i] = new Node(Integer.parseInt(br.readLine()), i);
    	
    	Arrays.sort(A);
    	
    	int max = 0;
    	for (int i=0; i<n; i++) if (A[i].index - i > max) max = A[i].index - i;
    	System.out.print(max + 1);
    }
}