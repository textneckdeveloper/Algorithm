import java.io.*;
import java.util.*;

public class Main {
	
	static int[] parent;
	
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
	
	static boolean check(int a, int b) {
		a = find(a);
		b = find(b);
		if (a == b) return true;
		else return false;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	parent = new int[n+1];
    	for (int i=0; i<parent.length; i++) parent[i] = i;
    	for (int i=0; i<m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int val = Integer.parseInt(st.nextToken());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		if (val == 0) union(a, b);
    		else {
    			boolean result = check(a, b);
    			if (result) {
    				bw.write("YES");
    				bw.newLine();
    			}
    			else {
    				bw.write("NO");
    				bw.newLine();
    			}
    		}
    	} bw.flush(); bw.close(); br.close();
    }
}