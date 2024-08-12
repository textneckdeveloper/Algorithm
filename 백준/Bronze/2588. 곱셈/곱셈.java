import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = Integer.toString(b);
        System.out.print(a*Character.getNumericValue(s.charAt(2)) + "\n" + a*Character.getNumericValue(s.charAt(1)) + "\n" + a*Character.getNumericValue(s.charAt(0)) + "\n" + a*b);
        sc.close();
    }
}