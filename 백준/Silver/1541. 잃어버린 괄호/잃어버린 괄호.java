import java.io.*;
import java.util.*;

public class Main {
	
	static int sum(String x) {
		int sum = 0;
		String[] tmp = x.split("[+]");
		for (int i=0; i<tmp.length; i++) sum += Integer.parseInt(tmp[i]); 
		return sum;
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	String[] str = s.split("[-]");
    	int answer = 0, tmp = 0;
    	for (int i=0; i<str.length; i++) {
    		tmp = sum(str[i]);
    		if (i == 0) answer += tmp;
    		else answer -= tmp;
    	} System.out.print(answer);
    }
    
}