import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int testCase = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=testCase; i++){
        	
            Queue<int[]> queue = new LinkedList<>();
            
            String s1 = br.readLine();
            String s2 = br.readLine();
            StringTokenizer st1 = new StringTokenizer(s1);
            StringTokenizer st2 = new StringTokenizer(s2);
            
            int document = Integer.parseInt(st1.nextToken());
            int position = Integer.parseInt(st1.nextToken());
            
            int num = 0;
            
            while(st2.hasMoreTokens()){
                queue.offer(new int[]{Integer.parseInt(st2.nextToken()), num++});
            }
            
            int count = 0;
            
            while(true){
                
                int[] check = queue.poll();
                boolean chk = true;
                
                for(int[] que : queue){
                    if(que[0] > check[0]){
                        chk = false;	
                        break;
                    }
                }
                
                if(chk){
                	count++;
                    if(check[1] == position){
                        pw.println(count);
                        break;
                    }
                }
                else{
                    queue.offer(check);
                }
                    
            }
             
        }
        
        pw.flush();
        br.close();
        pw.close();
        
    }
}