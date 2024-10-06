import java.util.*;

public class Main {
	
	static int[] D;
	
	static int fibonacci(int n) {
		if (D[n] != -1) return D[n];
		return D[n] = fibonacci(n-1) + fibonacci(n-2);
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	D = new int[n+1];
    	for (int i=0; i<n+1; i++) D[i] = -1;
    	D[0] = 0; D[1] = 1;
    	fibonacci(n);
    	System.out.print(D[n]);
    }
}