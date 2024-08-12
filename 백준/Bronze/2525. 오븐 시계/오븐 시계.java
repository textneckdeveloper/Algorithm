import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int hour = (B+C)/60;
        int minute = (B+C)%60;
        
        if(A+hour >= 24) {
        	System.out.print((A+hour)%24 + " " + minute);
        }
        else {
        	System.out.print((A+hour) + " " + minute);
        }
        sc.close();
    }
}