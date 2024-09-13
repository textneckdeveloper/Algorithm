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
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] A = new int[n];
    	for (int i=0; i<n; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	if (n <= 2) {
    		System.out.print(0);
    		return;
    	}
    	
    	Sorting s = new Sorting(A);
    	s.quickSort();
    	int a, b, count = 0;
    	for (int i=0; i<n; i++) {
    		a=0; b=n-1;
    		while (a < b) {
        		if (a == i) {
        			a++; continue;
        		}
        		if (b == i) {
        			b--; continue;
        		}
    			if (A[a] + A[b] < A[i]) {
    				a++;
    			}
    			else if (A[a] + A[b] > A[i]) {
    				b--;
    			}
    			else {
    				count++;
        			break;
    			}
    		}
    	}
    	System.out.print(count);
    }
}