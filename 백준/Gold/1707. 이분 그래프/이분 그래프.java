import java.io.*;
import java.util.*;

public class Main {
	
	static ArrayList<Integer>[] A;
	static int[] check;
	static boolean[] visited;
	static boolean isEven;
	
	static void dfs(int start) {
		visited[start] = true;
		for (int i : A[start]) {
			if (!visited[i]) {
				check[i] = (check[start] + 1) % 2;
				dfs(i);
			}
			else {
				if (check[start] == check[i]) isEven = false;
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	int testCase = Integer.parseInt(br.readLine());
    	for (int t=0; t<testCase; t++) {
    		String[] s = br.readLine().split(" ");
    		int v = Integer.parseInt(s[0]);
    		int e = Integer.parseInt(s[1]);
    		A = new ArrayList[v+1];
    		visited = new boolean[v+1];
    		check = new int[v+1];
    		isEven = true;
    		for (int i=1; i<=v; i++) A[i] = new ArrayList<>();
    		for (int i=0; i<e; i++) {
    			s = br.readLine().split(" ");
    			int start = Integer.parseInt(s[0]);
    			int end = Integer.parseInt(s[1]);
    			A[start].add(end);
    			A[end].add(start);
    		}
    		for (int i=1; i<=v; i++) {
    			if (isEven) dfs(i);
    			else break;
    		} if (isEven) pw.println("YES"); else pw.println("NO");
    	} pw.flush(); pw.close(); br.close();
    }
}