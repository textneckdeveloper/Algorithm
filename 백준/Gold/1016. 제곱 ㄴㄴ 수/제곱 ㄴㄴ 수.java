import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long min = sc.nextLong(), max = sc.nextLong();
    	boolean[] check = new boolean[(int)(max-min+1)];
    	for (long i=2; i*i<=max; i++) {
    		long pow = i*i, startIndex = min/pow;
    		if (min % pow != 0) startIndex++;
    		for (long j=startIndex; pow*j<=max; j++) check[(int)((j*pow)-min)] = true;
    	} int count = 0;
    	for (int i=0; i<=max-min; i++) if(!check[i]) count++;
    	System.out.print(count);
    }
}