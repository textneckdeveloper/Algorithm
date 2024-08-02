class Solution {
    public int solution(int n) {
        
        int sum = 0;
        
        if(n%2 != 0){
            while(n>=1){
                sum += n;
                n -= 2;  
            }
            return sum;
        }else{
            while(n>=2){
                sum += (int)Math.pow(n, 2);
                n -= 2;
            }
            return sum;
        }
        
    }
}