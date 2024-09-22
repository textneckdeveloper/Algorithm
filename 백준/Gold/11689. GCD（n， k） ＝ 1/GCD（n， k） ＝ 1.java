import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	long n = Long.parseLong(br.readLine());
    	long val = n;
    	for (long p=2; p*p<=n; p++) {
    		if (n%p==0) {
    			val = val-val/p;
    			while(n%p==0) n/=p;
    		}
    	} if (n>1) val = val-val/n;
    	System.out.print(val);
    }
}