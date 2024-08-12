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
        StringTokenizer st1 = new StringTokenizer(s);
        
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());
        
        int[] arr = new int[n];
        int count = 0;
        
        s = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s);
        
        while(st2.hasMoreTokens()) {
        	arr[count++] = Integer.parseInt(st2.nextToken());
        }
        
        for(int i : arr) {
        	if(x>i) {
        		bw.write(i + " ");
        	}
        }
    	
        bw.flush();
        br.close();
        bw.close();

    }
}