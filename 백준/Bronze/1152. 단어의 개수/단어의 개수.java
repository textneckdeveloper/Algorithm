import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); String s = sc.nextLine();
		String[] str = s.trim().split(" ");
		if (str[0].isEmpty()) System.out.print(0);
		else System.out.print(str.length);
	}
}