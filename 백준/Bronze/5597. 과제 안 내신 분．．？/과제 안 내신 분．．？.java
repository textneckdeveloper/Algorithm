import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int[] student = new int[28];
        boolean[] check = new boolean[30];
        
        for(int i=0; i<28; i++){
            student[i] = sc.nextInt();
            check[student[i]-1] = true;
        }
        
        for(int i=0; i<30; i++){
            if(check[i] == false){
                System.out.println(i+1);
            }
        }
        
    }
}