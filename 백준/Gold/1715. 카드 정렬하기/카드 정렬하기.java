import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine()), sum = 0;
    	PriorityQueue<Integer> queue = new PriorityQueue<>();
    	for (int i=1; i<=n; i++) queue.add(Integer.parseInt(br.readLine()));
    	if (n == 1) {
    		System.out.print(0);
    		return;
    	}
    	while (true) {
    		int val = queue.poll() + queue.poll();
    		sum += val;
    		if (queue.isEmpty()) break;
    		else queue.add(val);
    	} System.out.print(sum);
    }
}