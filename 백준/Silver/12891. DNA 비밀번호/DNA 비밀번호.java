import java.io.*;
import java.util.*;

public class Main {
    
	static int[] dna;
	static int[] my;
	static int checkString;
	
	static void add(char c) {
		switch (c) {
			case 'A' : dna[0]++; if (dna[0] == my[0]) checkString++; break;
			case 'C' : dna[1]++; if (dna[1] == my[1]) checkString++; break;
			case 'G' : dna[2]++; if (dna[2] == my[2]) checkString++; break;
			case 'T' : dna[3]++; if (dna[3] == my[3]) checkString++; break;
		}
	}
	static void remove(char c) {
		switch (c) {
			case 'A' : if (dna[0] == my[0]) checkString--; dna[0]--; break;
			case 'C' : if (dna[1] == my[1]) checkString--; dna[1]--; break;
			case 'G' : if (dna[2] == my[2]) checkString--; dna[2]--; break;
			case 'T' : if (dna[3] == my[3]) checkString--; dna[3]--; break;
		}
	}
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int s = Integer.parseInt(st.nextToken());
    	int p = Integer.parseInt(st.nextToken());
    	
    	char[] A = new char[s];
    	A = br.readLine().toCharArray();

    	checkString = 0;
    	dna = new int[4];
    	my = new int[4];
    	StringTokenizer st2 = new StringTokenizer(br.readLine());
    	for (int i=0; i<4; i++) {
    		my[i] = Integer.parseInt(st2.nextToken());
    		if (my[i] == 0) checkString++;
    	}
    	
    	int result = 0;
    	for (int i=0; i<p; i++) add(A[i]);
    	if (checkString == 4) result++;
    	for (int i=p; i<s; i++) {
    		int j = i-p;
    		add(A[i]);
    		remove(A[j]);
        	if (checkString == 4) result++;	
    	}
    	System.out.print(result);
    	
    	br.close();
    }
}