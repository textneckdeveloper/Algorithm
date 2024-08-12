import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 4 == 0 && (n % 400 == 0 || n % 100 != 0)){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        sc.close();
    }
}