import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), k = sc.nextInt();
    	long start = 1, end = k, result = 0;
    	while (start <= end) {
    		long middle = (start+end)/2;
    		long cnt = 0;
    		for (int i=1; i<=n; i++) cnt += Math.min(middle/i, n);
    		if (cnt < k) start = middle+1;
    		else {
    			result = middle;
    			end = middle-1;
    		}
    	} System.out.print(result);
    }
}