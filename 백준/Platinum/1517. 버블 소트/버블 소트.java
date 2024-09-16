import java.io.*;
import java.util.*;

public class Main {
    
	static long count = 0;
	
	static class Sorting {
		int[] A;
		
		Sorting(int[] B) {
			A = B;
		}
		
		void mergeSort() {
			int[] B = new int[A.length];
			mSort(0, A.length-1, B);
		}
		private void mSort(int p, int r, int[] B) {
			if (p<r) {
				int q = (p+r)/2;
				mSort(p, q, B);
				mSort(q+1, r, B);
				merge(p, q, r, B);
			}
		}
		private void merge(int p, int q, int r, int[] B) {
			int i = p;
			int j = q+1;
			int t = 0;
			while (i <= q && j <= r) {
				if (A[i] <= A[j]) B[t++] = A[i++];
				else {
					B[t++] = A[j++];
					count += (q-i+1);
				}
			}
			while (i <= q) B[t++] = A[i++];
			while (j <= r) B[t++] = A[j++];
			i = p;
			t = 0;
			while(i <= r) A[i++] = B[t++];
		}
	}
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int[] A = new int[Integer.parseInt(br.readLine())];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i=0; i<A.length; i++) A[i] = Integer.parseInt(st.nextToken());
    	Sorting s = new Sorting(A);
    	s.mergeSort();
    	System.out.print(count);
    }
    
}