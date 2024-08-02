class Solution {
    public int[] solution(int[] array) {
        
        int[] answer = new int[2];
        
        answer[0] = array[0];
        
        int count = 0;
        
        for(int i : array){
            
            if(i > answer[0]){
                answer[0] = i;
                answer[1] = count; 
            }
            
            count++;
            
        }
        
        return answer;
        
    }
}