import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        int[][] arr = new int[numlist.length][2];
        
        for(int i=0; i<numlist.length; i++){
            arr[i][0] = numlist[i];
            arr[i][1] = Math.abs(n - numlist[i]);
        }
        
        Arrays.sort(arr, (a, b) -> {
            int result = Integer.compare(a[1], b[1]);
            if(result == 0){
                return Integer.compare(b[0], a[0]);
            }
            return result;
        });
        
        int[] answer = new int[numlist.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = arr[i][0];
        }
        
        return answer;
        
    }
}