import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	
    	int n = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] A = new int[n];
    	int[] result = new int[n];
    	Stack<Integer> stack = new Stack<>();
    	for (int i=0; i<n; i++) A[i] = Integer.parseInt(st.nextToken());
        for (int i=n-1; i>=0; i--) {
            while (!stack.isEmpty() && stack.peek() <= A[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(A[i]);
        }

        for (int i=0; i<n; i++) {
            pw.print(result[i] + " ");
        }
    	
    	pw.flush();
    	pw.close();
    	br.close();
    }
}