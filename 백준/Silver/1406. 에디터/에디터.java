import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int commandCount = Integer.parseInt(br.readLine());

        LinkedList<Character> leftList = new LinkedList<>();
        LinkedList<Character> rightList = new LinkedList<>();

        for (char c : s.toCharArray()) {
            leftList.add(c);
        }

        for (int i = 0; i < commandCount; i++) {
        	
            String command = br.readLine();
            char type = command.charAt(0);

            switch (type) {
                case 'L':
                    if (!leftList.isEmpty()) {
                        rightList.addFirst(leftList.removeLast());
                    }
                    break;

                case 'D':
                    if (!rightList.isEmpty()) {
                        leftList.addLast(rightList.removeFirst());
                    }
                    break;

                case 'B':
                    if (!leftList.isEmpty()) {
                        leftList.removeLast();
                    }
                    break;

                case 'P':
                    char charToAdd = command.charAt(2);
                    leftList.addLast(charToAdd);
                    break;
            }
        }

        for (char c : leftList) {
            bw.write(c);
        }
        for (char c : rightList) {
            bw.write(c);
        }

        bw.flush();
        br.close();
        bw.close();
        
    }
}