class Solution {
    public int[] solution(int[] emergency) {
        
        int[] answer = new int[emergency.length];
        
        int count = 1;
        
        for(int i=0; i<emergency.length; i++){
            
            count = 1;
            
            answer[i] = count;
            
            for(int j=0; j<emergency.length; j++){
                if(emergency[j] > emergency[i]){
                    answer[i] = ++count;
                }
            }
            
        }
        
        return answer;
        
    }
}