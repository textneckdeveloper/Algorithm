import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in); PrintWriter pw = new PrintWriter(System.out);
    	int m = sc.nextInt(), n = sc.nextInt();
    	boolean[] check = new boolean[n+1]; Arrays.fill(check, true);
    	check[0] = check[1] = false;
    	for (int i=2; i*i<=n; i++) {
    		if (check[i]) for (int j=i*i; j<=n; j+=i) check[j] = false;
    	} for (int i=m; i<=n; i++) if (check[i]) pw.println(i);
    	pw.flush(); pw.close();
    }
}