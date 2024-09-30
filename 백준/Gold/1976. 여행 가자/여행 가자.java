import java.io.*;
import java.util.*;

public class Main {
	static int[] parent;
	
	static void union(int i, int j) {
		i = find(i);
		j = find(j);
		
		if (i < j) parent[j] = i;
		else parent[i] = j;
	}
	
	static int find(int i) {
		if (parent[i] == i) return i;
		else return parent[i] = find(parent[i]);
	}

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
    	parent = new int[n+1]; StringTokenizer st;
    	for (int i=1; i<parent.length; i++) parent[i] = i;
    	for (int i=1; i<=n; i++) {
    		st = new StringTokenizer(br.readLine());
    		for (int j=1; j<=n; j++) {
    			if (Integer.parseInt(st.nextToken()) == 1) union(i, j);
    		}
    	} st = new StringTokenizer(br.readLine());
    	int result = parent[Integer.parseInt(st.nextToken())];
    	boolean check = true;
    	while (st.hasMoreTokens()) {
    		if (result != parent[Integer.parseInt(st.nextToken())]) check = false;
    	}
    	if (check) System.out.print("YES");
    	else System.out.print("NO");
    	br.close();
    } 
}