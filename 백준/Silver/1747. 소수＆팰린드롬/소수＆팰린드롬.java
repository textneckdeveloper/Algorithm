import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	if (n == 1) {
    		System.out.print(2);
    		return;
    	}
    	int[] A = new int[1003002];
    	for (int i=0; i<A.length; i++) A[i] = i;
    	for (int i=2; i*i<=A.length-1; i++) {
    		if (A[i] == 0) continue;
    		for (int j=i*i; j<=A.length-1; j+=i) A[j] = 0;
    	} int count = 0; boolean yes = true;
    	for (int i=0; i<A.length; i++) {
    		if (A[i] >= n) {
        		String check = String.valueOf(A[i]);
        		count = 0; yes = true;
        		for (int j=check.length()-1; j>=check.length()/2; j--) {
        			if (check.charAt(j) != check.charAt(count++)) yes = false;
        		}
        		if (yes) {
        			System.out.print(check);
        			break;
        		}
    		}
    	}
    }
}