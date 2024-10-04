import java.io.*;
import java.util.*;

public class Main {
	
	static PrintWriter pw = new PrintWriter(System.out);
	static int[][] tree;
	
	static void preOrder(int val) {
		if (val != -1) {
			pw.print((char)(val + 'A'));
			preOrder(tree[val][0]);
			preOrder(tree[val][1]);
		}
	}
	static void inOrder(int val) {
		if (val != -1) {
			inOrder(tree[val][0]);
			pw.print((char)(val + 'A'));
			inOrder(tree[val][1]);
		}
	}
	static void postOrder(int val) {
		if (val != -1) {
			postOrder(tree[val][0]);
			postOrder(tree[val][1]);
			pw.print((char)(val + 'A'));
		}
	}

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	tree = new int[n][2];
    	for (int i=0; i<n; i++) {
    		String[] tmp = br.readLine().split(" ");
    		int node = tmp[0].charAt(0) - 'A';
    		char left = tmp[1].charAt(0);
    		char right = tmp[2].charAt(0);
    		
    		if (left == '.') tree[node][0] = -1;
    		else tree[node][0] = left - 'A';
    		
    		if (right == '.') tree[node][1] = -1;
    		else tree[node][1] = right - 'A';
    	}
    	
    	preOrder(0); pw.println();
    	inOrder(0); pw.println();
    	postOrder(0); pw.flush(); pw.close(); br.close();
    }
}