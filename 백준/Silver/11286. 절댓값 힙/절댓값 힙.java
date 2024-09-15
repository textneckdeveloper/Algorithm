import java.io.*;
import java.util.*;

public class Main {
    
    static class Node implements Comparable<Node> {
		int value;
		boolean abs;
		
		Node(int value, boolean abs) {
			this.value = value;
			this.abs = abs;
		}

		public int compareTo(Node o) {
			if (this.value != o.value) return Integer.compare(this.value, o.value);
			return Boolean.compare(o.abs, this.abs);
		}
	}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	
    	int n = Integer.parseInt(br.readLine());
    	PriorityQueue<Node> queue = new PriorityQueue<>();
    	for (int i=1; i<=n; i++) {
    		int x = Integer.parseInt(br.readLine());
    		if (x != 0) {
    			if (x > 0) queue.add(new Node(Math.abs(x), false));
    			else queue.add(new Node(Math.abs(x), true));
    		}
    		else {
    			if (!queue.isEmpty()) {
    				Node returnVal = queue.remove();
    				if (returnVal.abs == true) pw.println("-" + returnVal.value); 
    				else pw.println(returnVal.value);
    			}
    			else pw.println(0);
    		}
    	}
    	
    	pw.flush();
    	pw.close();
    	br.close();
    }
}