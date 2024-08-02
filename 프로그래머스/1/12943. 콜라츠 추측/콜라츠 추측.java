class Solution {
    public int solution(int num) {
        
        long n = num;
        int count = 0;
        
        if(n == 1){
            return 0;
        }
        
        while(count < 500){
            
            n = n%2 == 0 ? n/2 : n*3+1;
            count++;
            
            if(n == 1){
                return count;
            }
            
        }
        
        return -1;
        
    }
}