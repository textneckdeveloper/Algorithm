class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length];
        
        int count = 0;
        
        for(int i : arr){
            if((i >= 50) && (i % 2 == 0)){
                i /= 2;
            }else if((i<50) && (i % 2 != 0)){
                i *= 2;
            }
            
            answer[count++] = i;
            
        }
        
        return answer;
        
    }
}