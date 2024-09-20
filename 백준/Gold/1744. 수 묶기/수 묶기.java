import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine()), val = 0, sum = 0;
    	PriorityQueue<Integer> minus = new PriorityQueue<>();
    	PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
    	for (int i=0; i<n; i++) {
    		val = Integer.parseInt(br.readLine());
    		if (val <= 0) minus.add(val);
    		else plus.add(val);
    	}
    	while (minus.size() > 1) {
    		sum += minus.poll() * minus.poll();
    	} if (!minus.isEmpty()) sum += minus.poll();
    	while (plus.size() > 1) {
    		int a = plus.poll();
    		int b = plus.poll();
    		sum += (a*b > a+b) ? a*b : a+b;
    	} if (!plus.isEmpty()) sum += plus.poll();
    	System.out.print(sum);
    }
}