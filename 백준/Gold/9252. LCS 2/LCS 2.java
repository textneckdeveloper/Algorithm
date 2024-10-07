import java.io.*;
import java.util.*;

public class Main {
	
	static char[] A;
	static char[] B;
	static long[][] DP;
	static ArrayList<Character> txt;
	
	static void getLCS(int r, int c) {
		if (r == 0 || c == 0) return;
		if (A[r-1] == B[c-1]) {
			txt.add(A[r-1]);
			getLCS(r-1, c-1);
		}
		else {
			if (DP[r-1][c] > DP[r][c-1]) getLCS(r-1, c);
			else getLCS(r, c-1);
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	A = br.readLine().toCharArray();
    	B = br.readLine().toCharArray();
    	
    	DP = new long[A.length+1][B.length+1];
    	
    	txt = new ArrayList<Character>();
    	
    	for (int i=1; i<=A.length; i++) {
    		for (int j=1; j<=B.length; j++) {
    			if (A[i-1] == B[j-1]) DP[i][j] = DP[i-1][j-1] + 1;
    			else DP[i][j] = Math.max(DP[i][j-1], DP[i-1][j]);
    		}
    	} System.out.println(DP[A.length][B.length]);
    	
    	getLCS(A.length, B.length);
    	for (int i=txt.size()-1; i>=0; i--) System.out.print(txt.get(i)); 
    }
}