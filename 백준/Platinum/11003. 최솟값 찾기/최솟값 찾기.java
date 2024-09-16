import java.io.*;
import java.util.*;

public class Main {
    
    static class Node {
		int value;
		int index;

		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int L = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	Deque<Node> q = new LinkedList<>();
    	for (int i=0; i<N; i++) {
    		int val = Integer.parseInt(st.nextToken());
    		
    		while (!q.isEmpty() && q.getLast().value > val) q.removeLast();
    		q.addLast(new Node(val, i));
    		
    		if (q.getFirst().index <= i-L) {
    			q.removeFirst();
    		}
    		bw.write(q.getFirst().value + " ");
    	}
    	
    	bw.flush();
    	bw.close();
    	br.close();
    }
}