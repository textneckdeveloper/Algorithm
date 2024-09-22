import java.io.*;
import java.util.*;

public class Main {
	static long gcd(long a, long b) {
		while (a != 0) {
			long tmp = a;
			a = b%a;
			b = tmp;
		} return b;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
    	long loop = gcd(a, b);
    	for (int i=1; i<=loop; i++) pw.print(1); pw.flush(); pw.close(); br.close();
    }
}