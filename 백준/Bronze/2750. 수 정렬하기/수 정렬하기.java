import java.io.*;
import java.util.*;

public class Main {
    
    static class Sorting {
        int[] A;
        Sorting(int[] B) {
            A = B;
        }
        
        void quickSort() {
            qSort(0, A.length-1);
        }
        private void qSort(int p, int r) {
            if (p < r) {
                int q = partition(p, r);
                qSort(0, q-1);
                qSort(q+1, r);
            }
        }
        private int partition(int p, int r) {
            int i = p-1;
            int pivot = A[r];
            int tmp;
            for (int j=p; j<r; j++) {
                if (A[j] < pivot) {
                    i++;
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
            tmp = A[i+1];
            A[i+1] = A[r];
            A[r] = tmp;
            return i+1;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Sorting s = new Sorting(arr);
        s.quickSort();
        
        for (int i=0; i<arr.length; i++) {
            pw.println(arr[i]);
        }
        
        pw.flush();
        br.close();
        pw.close();
    }
}