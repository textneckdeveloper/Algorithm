import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] basket = new int[n];
        
        for(int a=0; a<n; a++){
            basket[a] = 0;
        }
        
        for(int b=1; b<=m; b++) {
        	
        	s = br.readLine();
        	StringTokenizer st2 = new StringTokenizer(s);
        	
        	int i = Integer.parseInt(st2.nextToken());
        	int j = Integer.parseInt(st2.nextToken());
        	int k = Integer.parseInt(st2.nextToken());
        	
        	for(int x=i-1; x<j; x++) {
        		basket[x] = k;
        	}
        	
        }
        
        for(int c : basket) {
        	bw.write(c + " ");
        }
        
        bw.flush();
        br.close();
        bw.close();
        
    }
}