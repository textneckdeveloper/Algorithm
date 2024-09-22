import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j < 2 * (i - 1); j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}