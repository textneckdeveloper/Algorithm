import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            try {
                String s = br.readLine();
                bw.write(s);
                bw.newLine();
            } catch (Exception e) {
                break;
            } 
        }
        bw.flush();
        br.close();
        bw.close();
    }
}