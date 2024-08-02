class Solution {
    public int solution(int slice, int n) {
        
        int answer = 1;
        
        int add = slice;
        
        if(slice >= n){
            return 1;
        }
        
        while(add < n){
            add += slice;
            answer++;
        }
        
        return answer;
        
    }
}