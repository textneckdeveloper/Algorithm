import java.io.*;

public class Main {
    	static class Sorting {
		int[] A;
		
		Sorting(int[] B) {
			A = B;
		}
		
		void quickSort() {
			qSort(0, A.length-1);
		}
		private void qSort(int p, int r) {
			if (p<r) {
				int q = partition(p, r);
				qSort(p, q-1);
				qSort(q+1, r);
			}
		}
		private int partition(int p, int r) {
			int i = p-1;
			int x = A[r];
			int tmp;
			for (int j=p; j<r; j++) {
				if (A[j] >= x) {
					i++;
					tmp = A[i];
					A[i] = A[j];
					A[j] = tmp;
				}
			}
			tmp = A[i+1];
			A[i+1] = A[r];
			A[r] = tmp;
			return i+1;
		}
	}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	char[] c = br.readLine().toCharArray();
    	int[] val = new int[c.length];
    	for (int i=0; i<val.length; i++) val[i] = c[i] - '0';
    	
    	Sorting s = new Sorting(val);
    	s.quickSort();
    	for (int i=0; i<val.length; i++) System.out.print(val[i]);
    }
}