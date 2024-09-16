import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[8]; boolean as = true; boolean de = true;
		for (int i=0; i<8; i++) A[i] = Integer.parseInt(st.nextToken());
		for (int i=0; i<8; i++) {
			if (A[i] != i+1) as = false;
			if (A[i] != 8-i) de = false;
		}
		if (as) System.out.print("ascending");
		else if (de) System.out.print("descending");
		else System.out.print("mixed");
	}
}