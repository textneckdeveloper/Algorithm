import java.io.*;
import java.util.*;

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
            if (p < r) {
                int q = partition(p, r);
                qSort(p, q-1);
                qSort(q+1, r);
            }
        }
        private int partition(int p, int r) {
            int pivot = A[r];
            int i = p-1;
            int tmp;
            for (int j=p; j<r; j++) {
                if (A[j] <= pivot) {
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
    	int n = Integer.parseInt(br.readLine());
    	int m = Integer.parseInt(br.readLine());
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] val = new int[n];
    	for (int i=0; i<n; i++) {
    		val[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Sorting s = new Sorting(val);
    	s.quickSort();
    	
    	int count = 0;
    	int i = 0;
    	int j = n-1;
    	while (i < j) {
    		if (val[i] + val[j] < m) {
    			i++;
    		}
    		else if (val[i] + val[j] > m) {
    			j--;
    		}
    		else {
    			count++;
    			i++;
    			j--;
    		}
    	}
    	System.out.print(count);
    }
    
}