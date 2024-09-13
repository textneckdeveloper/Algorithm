import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int sum = 1;
    	int count = 1;
    	int start = 1;
    	int end = 1;
    	
    	while (end != n) {
    		if (sum > n) {
    			sum -= start;
    			start++;
    		}
    		else if (sum < n) {
    			end++;
    			sum += end;
    		}
    		else {
    			count++;
    			end++;
    			sum += end;
    		}
    	}
    	System.out.print(count);
    }
}