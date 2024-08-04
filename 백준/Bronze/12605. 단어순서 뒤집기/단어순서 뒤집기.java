import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        Stack<String> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=N; i++){
            
            String s = br.readLine();
            
            String[] strArr = s.split(" ");
            
            for(String str : strArr){
                stack.push(str);
            }
            
            StringBuilder sb = new StringBuilder();
            
            while(!stack.isEmpty()){
                sb.append(stack.pop()).append(" ");
            }
            
            if(sb.length() > 0){
                sb.setLength(sb.length()-1);
            }
            
            pw.println("Case #" + i + ": " + sb);
            
        }
        
        pw.flush();
        br.close();
        pw.close();
        
    }
}