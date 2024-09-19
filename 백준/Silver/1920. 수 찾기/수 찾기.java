import java.io.*;
import java.util.*;

public class Main {
	static boolean search(int[] A, int findVal) {
		int low = 0, high = A.length-1;
		while (low <= high) {
			int mid = low+(high-low)/2;
			if (A[mid] > findVal) {
				high = mid-1;
			}
			else if (A[mid] < findVal) {
				low = mid+1;
			}
			else {
				return true;
			}
		} return false;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out); StringTokenizer st;
    	int n = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine()); int[] A = new int[n];
    	for (int i=0; i<n; i++) A[i] = Integer.parseInt(st.nextToken()); Arrays.sort(A);
    	int m = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine());
    	for (int i=0; i<m; i++) {
    		int findVal = Integer.parseInt(st.nextToken());
    		if (search(A, findVal)) pw.println(1);
    		else pw.println(0);
    	} pw.flush(); pw.close(); br.close();
    }
}