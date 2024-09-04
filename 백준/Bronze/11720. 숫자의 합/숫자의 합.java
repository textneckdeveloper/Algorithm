import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] str = s.split("");
        int sum = 0;
        for(String st : str) {
        	sum += Integer.parseInt(st);
        }
        System.out.println(sum);
        sc.close();
    }
}