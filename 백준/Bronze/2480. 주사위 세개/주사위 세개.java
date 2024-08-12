import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = 0;
        int price = 0;
        
        price = (a==b && b==c && a==c) ? 10000+a*1000 : 0;
        
        price = (a==b && b!=c && a!=c) ? 1000+a*100 :
                (a!=b && b==c && a!=c) ? 1000+b*100 :
                (a!=b && b!=c && a==c) ? 1000+c*100 : price;
        
        max = a>=b && a>=c ? a : b>=a && b>=c ? b : c>=a && c>=b ? c : 0;
        
        price = (a!=b && b!=c && a!=c) ? max*100 : price;
        
        System.out.print(price);
        sc.close();
    }
}