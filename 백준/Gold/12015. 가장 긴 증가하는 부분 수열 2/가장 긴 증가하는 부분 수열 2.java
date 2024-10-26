import java.util.*;
import java.io.*;

public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int n = Integer.parseInt(br.readLine());
 
		int[] arr = new int[n];
		int[] lis = new int[n];
 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
 
		lis[0] = arr[0];
		int len = 1;
		
		for (int i=1; i<n; i++) {
			int key = arr[i];
			
			if (lis[len-1] < key) {
				len++;
				lis[len-1] = key;
			} 
			else {
				int lo = 0;
				int hi = len;
				while (lo<hi) {
					int mid = (lo+hi)/2;
					if(lis[mid] < key) lo = mid+1;
					else hi = mid;
				} lis[lo] = key;
			}
		}
		
		System.out.print(len);
		
	}
}