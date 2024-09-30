import java.io.*;
import java.util.*;

public class Main {
	
	static int[] parent;
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if (x < y) parent[y] = x;
		else parent[x] = y;
	}
	
	static int find(int x) {
		if (parent[x] == x) return x;
		else return parent[x] = find(parent[x]);
	}

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
    	parent = new int[n+1];
    	for (int i=1; i<parent.length; i++) parent[i] = i;
        
    	st = new StringTokenizer(br.readLine());
    	int isTrue = Integer.parseInt(st.nextToken());
    	if (isTrue == 0) {
    		System.out.print(m);
    		return;
    	} int val = Integer.parseInt(st.nextToken());
    	while (st.hasMoreTokens()) union(val, Integer.parseInt(st.nextToken()));
        
    	List<int[]> party = new ArrayList<>();
    	for (int i=0; i<m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int size = Integer.parseInt(st.nextToken());
    		int[] num = new int[size];
    		for (int j=0; j<size; j++) num[j] = Integer.parseInt(st.nextToken());
    		party.add(num);
    		for (int j=1; j<size; j++) union(num[0], num[j]);
    	} int count = 0;
        
    	for (int[] p : party) {
    		boolean check = true;
    		for (int person : p) {
    			if (find(person) == find(val)) {
    				check = false;
    				break;
    			}
    		} if (check) count++;
    	} System.out.print(count);
    }
}