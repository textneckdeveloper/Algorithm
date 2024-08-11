import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for (int count = 0; count < commands.length; count++) {
            
            int i = commands[count][0];
            int j = commands[count][1];
            int k = commands[count][2];

            int[] subArray = Arrays.copyOfRange(array, i - 1, j);
            
            Arrays.sort(subArray);
            
            answer[count] = subArray[k - 1];
            
        }
        
        return answer;
        
    }
}