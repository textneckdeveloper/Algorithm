import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); int t = sc.nextInt();
		for (int i=1; i<=t; i++) {
			int h = sc.nextInt(); int w = sc.nextInt(); int n = sc.nextInt();
            int floor = (n%h==0)?h:n%h; int roomNumber = (n%h==0)?(n/h):(n/h+1);
            System.out.println(floor + String.format("%02d", roomNumber));
		} sc.close();
	}
}