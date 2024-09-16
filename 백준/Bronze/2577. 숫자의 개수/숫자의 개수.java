import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); int[] cnt = new int[10];
		String x = "" + (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String[] s = x.split("");
		for (String str : s) cnt[Integer.parseInt(str)]++;
		for (int i=0; i<=9; i++) System.out.println(cnt[i]);
	}
}
