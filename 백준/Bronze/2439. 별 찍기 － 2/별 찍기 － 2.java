import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j < count){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            count--;
            System.out.println();
        }
        sc.close();
    }
}