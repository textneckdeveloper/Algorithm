import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        String s = br.readLine();
        
        StringTokenizer st = new StringTokenizer(s);
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<=N; i++){
            deque.addLast(i);
        }
 
        StringBuilder sb = new StringBuilder("<");
        
        while(!deque.isEmpty()){
            
            for(int i=1; i<=K-1; i++){
                deque.addLast(deque.removeFirst());
            }
            
            sb.append(deque.removeFirst());
            
            if(!deque.isEmpty()){
                sb.append(", ");
            }
            
        }
        
        sb.append(">");
        
        pw.print(sb);
        
        pw.flush();
        br.close();
        pw.close();
        
    }
}