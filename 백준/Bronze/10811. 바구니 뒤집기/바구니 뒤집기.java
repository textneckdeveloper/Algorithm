import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
    	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] baskets = new int[n];
        
        for(int i=0; i<n; i++){
        	baskets[i] = i+1;
        }
        
        for(int i=0; i<m; i++){
        	
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            a--;
            b--;
            
            while(a < b){
                int temp = baskets[a];
                baskets[a] = baskets[b];
                baskets[b] = temp;
                a++;
                b--;
            }
            
        }

        for(int i=0; i<n; i++){
            System.out.print(baskets[i] + " ");
        }
        
        sc.close();
        
    }
}