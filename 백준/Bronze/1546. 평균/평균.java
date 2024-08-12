import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] score = new int[n];
        
        for(int i=0; i<n; i++){
            score[i] = sc.nextInt();
        }
        
        Arrays.sort(score);
        
        double sum = 0;
        
        for(double i : score){
            sum += i / score[n-1] * 100;
        }
        
        System.out.print(sum/n);
        
        sc.close();
        
    }
}