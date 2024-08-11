import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i=0; i<T; i++) {
    		
    		String s = br.readLine();
    		StringTokenizer st = new StringTokenizer(s);
    		
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken()) % 4;
    		
    		String result = (b != 0) ? 
    				String.valueOf((int)Math.pow(a, b)) :
    				String.valueOf((int)Math.pow(a, 4));
    		
    		if(i < T-1) {
    			if(result.charAt(result.length()-1) == '0') {
    				pw.println(10);
    			}
    			else {
    				pw.println(result.charAt(result.length()-1));
    			}
    		}
    		else {
    			if(result.charAt(result.length()-1) == '0') {
    				pw.print(10);
    			}
    			else {
    				pw.print(result.charAt(result.length()-1));
    			}
    		}
    		
    	}
    	
		pw.flush();
		br.close();
		pw.close();
        
    }
}