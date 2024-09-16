import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
        	try {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		int a = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        		int b = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        		int c = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        		if (a==0 && b==0 && c==0) break;
        		if (a+b == c) bw.write("right");
        		else if (a+c == b) bw.write("right");
        		else if (b+c == a) bw.write("right");
        		else bw.write("wrong");
        		bw.newLine();
        	} catch (Exception e) {
        		break;
        	}
        }
        bw.flush(); bw.close(); br.close();
    }
}