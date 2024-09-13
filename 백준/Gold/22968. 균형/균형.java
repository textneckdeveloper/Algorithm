import java.io.*;

public class Main {
    
    static int height(int n) {
    	int n1 = 4;
    	int n2 = 2;
        int height = 3;
        
        if (n < 3) {
            return (int) n;
        }
        
        int temp = n1 + n2 + 1;	
        while (temp <= n) {
            n2 = n1;
            n1 = temp;
            height++;
            temp = n1 + n2 + 1;
        }
        
        return height;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine());
        int[] results = new int[t];
        
        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            results[i] = height(n);
        }
        
        for (int result : results) {
            pw.println(result);
        }
        
        pw.flush();
        br.close();
        pw.close();
    }
    
}