class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            for(int i=0; i<answer.length; i++){
                answer[i] = numbers[numbers.length-1];
                if(i >= 1){
                    answer[i] = numbers[i-1];
                }
            }    
        }
        else{
            for(int i=0; i<answer.length; i++){
                answer[answer.length-1] = numbers[0]; 
                if(i < answer.length - 1){
                    answer[i] = numbers[i+1];
                }
            }
        }
        
        return answer;
        
    }
}