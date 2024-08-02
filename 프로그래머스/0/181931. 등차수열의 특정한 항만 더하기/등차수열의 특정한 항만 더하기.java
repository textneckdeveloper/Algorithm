class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int answer = 0;
        
        int sum = a;
        
        for(int i=0; i<included.length; i++){
            
            int result = included[i] == true ? sum : 0;
            
            answer += result;
            
            sum += d;
            
        }
        
        return answer;
        
    }
}