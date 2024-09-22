import java.io.*;
import java.util.*;

public class Main {
	static int gcd(int a, int b) {
		while (a!= 0) {
			int tmp = a;
			a = b%a;
			b = tmp;
		} return b;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	int n = Integer.parseInt(br.readLine()); StringTokenizer st;
    	for (int i=1; i<=n; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
    		pw.println((a*b)/gcd(a, b));
    	} pw.flush(); pw.close(); br.close();
    }
}