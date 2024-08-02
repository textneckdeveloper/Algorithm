class Solution {
    public int solution(int n) {
        
        int sum = 1;
        
        for(int i=1; i<=n; i++){
            sum *= i;
            if(sum > n){
                return i-1;
            }
            else if(sum == n){
                return i;
            }
        }
        
        return 1;
        
    }
}