import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=1; i<=10; i++) {
    		int mod = sc.nextInt() % 42;
    		set.add(mod);
    	}
        
        int count = 0;
        
        for(int i : set) {
    		count++;
    	}
    	
    	System.out.println(count);
        
        sc.close();
        
    }
}