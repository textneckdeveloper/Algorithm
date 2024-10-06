import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();    	
    	long[] D = new long[n+1];
    	
    	if (n == 1) {
    		System.out.print(1);
    		return ;
    	} D[1] = 1; D[2] = 1;

    	for (int i=3; i<=n; i++) D[i] = D[i-1] + D[i-2];
    	System.out.print(D[n]);
    }
}