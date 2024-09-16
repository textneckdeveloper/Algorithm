import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder("");
    	
    	int count = 1;
    	boolean yesNo = true;
    	Stack<Integer> stack = new Stack<>();
    	int n = Integer.parseInt(br.readLine());
    	end:for (int i=1; i<=n; i++) {
    		int check = Integer.parseInt(br.readLine());
    		if (stack.isEmpty()) {
    			stack.push(count++);
    			sb.append("+" + "\n");
    		}
    		while (!stack.isEmpty()) {
    			if (stack.peek() < check) {
    				stack.push(count++);
    				sb.append("+" + "\n");
    			}
    			else if (stack.peek() == check) {
    				stack.pop();
    				sb.append("-" + "\n");
    				break;
    			}
    			else {
    				yesNo = false;
    				break end;
    			}
    		}
    	}
    	
    	if (yesNo == true) {
    		System.out.print(sb);
        	br.close();
    	}
    	else System.out.print("NO");
    }
}