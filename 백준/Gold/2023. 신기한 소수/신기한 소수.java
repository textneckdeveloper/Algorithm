import java.io.*;

public class Main {
	
	static int n;
	static PrintWriter pw;
	
	static void dfs(int num, int digit) {
		if (digit == n) {
			if (isPrime(num)) pw.println(num);
			return;
		}
		for (int i=1; i<10; i++) {
			if (i%2 == 0) continue;
			if (isPrime(num*10+i)) dfs(num*10+i, digit+1);
		}
	}
	static boolean isPrime(int num) {
		for (int i=2; i<=num/2; i++) {
			if (num%i == 0) return false;
		} return true;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	pw = new PrintWriter(System.out);
    	
    	n = Integer.parseInt(br.readLine());
    	dfs(2, 1); dfs(3, 1); dfs(5, 1); dfs(7, 1);
    	pw.flush(); pw.close(); br.close();
    }
}