import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	long[][] D = new long[n+1][11];
    	
    	for (int i=1; i<=9; i++) D[1][i] = 1;
    	for (int i=2; i<=n; i++) {
    		D[i][0] = D[i-1][1];
    		D[i][9] = D[i-1][8];
    		for (int j=1; j<=8; j++) D[i][j] = (D[i-1][j-1] + D[i-1][j+1]) % 1000000000;
     	} long sum = 0;
     	for (int i=0; i<10; i++) sum = (sum + D[n][i]) % 1000000000;
     	System.out.print(sum);
    }
}