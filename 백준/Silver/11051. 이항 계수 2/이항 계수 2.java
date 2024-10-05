import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), k = sc.nextInt();
    	int[][] D = new int[n+1][n+1];
    	for (int i=0; i<=n; i++) {
    		D[i][0] = 1; D[i][i] = 1; D[i][1] = i;
    	}
    	for (int i=2; i<=n; i++) {
    		for (int j=1; j<i; j++) D[i][j] = (D[i-1][j] + D[i-1][j-1]) % 10007;
    	} System.out.print(D[n][k]);
    }
}