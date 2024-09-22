import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), result = 0;
    	for (int i=1; i<=n; i++) {
    		String s = String.valueOf(i);
    		int sum = i;
    		for (int j=0; j<s.length(); j++) sum += s.charAt(j) - '0';
    		if (sum == n) {
    			result = i;
    			break;
    		}
    	} System.out.print(result);
    }
}