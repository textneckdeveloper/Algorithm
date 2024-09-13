import java.util.Scanner;

public class Main {
    
    static class Sorting {
		int[] A;
		
		Sorting(int[] B) {
			A = B;
		}
		
		int[] countingSort(int k) {
			int[] cnt = new int[k];
			for (int i=0; i<A.length; i++) {
				cnt[A[i]]++;
			}
			cnt[0]--;
			for (int i=1; i<k; i++) {
				cnt[i] += cnt[i-1];
			}
			int[] B = new int[A.length];
			for (int i=A.length-1; i>=0; i--) {
				B[cnt[A[i]]--] = A[i];
			}
			return B;
		}
	}
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	int max = 0;
    	int[] val = new int[n];
    	for (int i=0; i<n; i++) {
    		val[i] = sc.nextInt();
    		max = (val[i] > max) ? val[i] : max;
    	}
    	
    	Sorting s = new Sorting(val);
    	val = s.countingSort(max+1);
    	
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