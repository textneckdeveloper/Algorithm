import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if(M - 45 < 0){
            if(H == 0){
                System.out.print(23 + " " + (60 + (M-45)));
            }
            else{
                System.out.print((H-1) + " " + (60 + (M-45)));
            }
        }
        else{
            System.out.print(H + " " + (M-45));
        }
    }
}