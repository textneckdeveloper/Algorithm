import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int check = sc.nextInt();
        int count = 0;
        
        for(int i : arr){
            count += (i == check) ? 1 : 0;
        }
        
        System.out.print(count);
        sc.close();
    }
}