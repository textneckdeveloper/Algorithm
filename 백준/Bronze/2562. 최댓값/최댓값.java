import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        
        int idx = 0;
        
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] arrClone = arr.clone();
        
        Arrays.sort(arr);
        
        for(int i=0; i<9; i++) {
        	idx = (arr[8] == arrClone[i]) ? i+1 : 0;
        	if(idx != 0) break;
        }
        
        System.out.print(arr[8] + "\n" + idx);
        
        sc.close();
        
    }
}