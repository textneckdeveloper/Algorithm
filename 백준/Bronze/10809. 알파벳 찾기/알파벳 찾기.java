import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] positions = new int[26];
        for (int i=0; i<26; i++) positions[i] = -1;   
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (positions[ch-'a'] == -1) positions[ch-'a'] = i;
        }
        for (int i=0; i<26; i++) System.out.print(positions[i] + " ");
        br.close();
    }
}