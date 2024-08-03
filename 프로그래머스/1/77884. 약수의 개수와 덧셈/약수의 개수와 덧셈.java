class Solution {
    public int solution(int left, int right) {
        
        int sum = 0;
        int check = 0;
        
        while(left <= right){
            
            check = 0;
            
            for(int i=1; i<=left; i++){
                if(left % i == 0){
                    check++;
                }
            }
            sum += (check % 2 == 0) ? left : -left;
            left++;
        }

        return sum;
        
    }
}