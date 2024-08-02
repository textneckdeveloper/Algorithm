class Solution {
    public int solution(int n) {
        
        int answer = n;
        
        while(answer % 6 != 0){
            answer += n;
        }
        
        return answer/6;
        
    }
}