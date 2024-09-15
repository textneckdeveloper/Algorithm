import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	Deque<Integer> q = new LinkedList<>();
    	for (int i=1; i<=n; i++) q.addLast(i);
    	while (q.size() != 1) {
    		q.removeFirst();
    		q.addLast(q.removeFirst());
    	}
    	System.out.print(q.peek());
    }
}