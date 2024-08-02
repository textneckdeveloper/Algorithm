class Solution {
    public int solution(int[] sides) {
        
        int max = 0;
        int sum = 0;
        
        for(int i=0; i<sides.length; i++){
            
            sum += sides[i];

            if(sides[i] > max){
                max = sides[i];
            }
            
        }
        
        sum -= max;
        
        if(max >= sum){
            return 2;
        }else{
            return 1;
        }

    }
}