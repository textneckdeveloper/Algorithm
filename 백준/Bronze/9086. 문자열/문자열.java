import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=n; i++) {
            String s = sc.nextLine();
            System.out.println(s.charAt(0) + "" + s.charAt(s.length()-1));
        }
        sc.close();
    }
}