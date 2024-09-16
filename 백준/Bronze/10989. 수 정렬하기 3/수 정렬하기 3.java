import java.io.*;

public class Main {
    
    static int[] countingSort(int k, int[] A) {
		int[] cnt = new int[k];
		for (int i=0; i<A.length; i++) cnt[A[i]]++;
		cnt[0]--;
		for (int i=1; i<cnt.length; i++) cnt[i] += cnt[i-1];
		int[] B = new int[A.length];
		for (int i=A.length-1; i>=0; i--) B[cnt[A[i]]--] = A[i];
		return B;
	}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter pw = new PrintWriter(System.out);
    	int[] A = new int[Integer.parseInt(br.readLine())];
    	for (int i=0; i<A.length; i++) A[i] = Integer.parseInt(br.readLine());
    	A = countingSort(10001, A);
    	for (int i : A) pw.println(i);
    	
    	pw.flush();
    	pw.close();
    	br.close();
    }
    
}