import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);        
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        System.out.print(Integer.parseInt(s1, Integer.parseInt(s2)));
        sc.close();
    }
}