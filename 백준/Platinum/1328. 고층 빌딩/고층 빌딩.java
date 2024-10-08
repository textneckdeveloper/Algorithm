import java.util.*;

public class Main {
	static long mod = 1000000007;
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
    	long D[][][] = new long[101][101][101];
    	D[1][1][1] = 1;
    	for (int i=2; i<=n; i++) {
    		for (int j=1; j<=l; j++) {
    			for (int k=1; k<=r; k++) 
    			D[i][j][k] = (D[i-1][j][k] * (i-2) + (D[i-1][j][k-1]+D[i-1][j-1][k])) % mod; 
    		}
    	} System.out.print(D[n][l][r]);
    }
}