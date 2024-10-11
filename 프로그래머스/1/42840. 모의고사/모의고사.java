import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[][] arr = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] scores = new int[3];
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == arr[0][i%5]) scores[0]++;
            if (answers[i] == arr[1][i%8]) scores[1]++;
            if (answers[i] == arr[2][i%10]) scores[2]++;
        } int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        int size = 0;
        for (int score : scores) if (score == max) size++;
        
        int[] result = new int[size];
        int index = 0;
        for (int i=0; i<scores.length; i++) if (scores[i] == max) result[index++] = i+1;
        
        Arrays.sort(result);
        
        return result;
        
    }
}