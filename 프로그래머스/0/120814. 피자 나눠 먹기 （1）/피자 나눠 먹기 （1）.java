class Solution {
    public int solution(int n) {
        
        int a = n/7;
        int b = 0;
        
        if(n % 7 != 0){
            b++;
        }
        else if(n < 7){
            return 1;
        }
        
        return a+b;
        
    }
}