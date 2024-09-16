import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		for (int i=1; i<=t; i++) {
			char[] c = br.readLine().toCharArray();
			int count = 0; int sum = 0;
			for (int j=0; j<c.length; j++) {
				count = c[j] == 'O' ? count+1 : 0;
				sum += count;
			} pw.println(sum);
		} pw.flush(); pw.close(); br.close();
	}
}