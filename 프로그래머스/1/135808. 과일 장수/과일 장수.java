import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        Arrays.sort(score);
        
        int count = score.length-1;
        int[][] result = new int[score.length/m][m];
        for (int i=0; i<result.length; i++) for (int j=0; j<m; j++) result[i][j] = score[count--];
        
        int sum = 0;
        for (int[] r : result) {
            int min = r[0];
            for (int rr : r) if (min > rr) min = rr;
            sum += min * m;
        }

        return sum;
    
    }
}