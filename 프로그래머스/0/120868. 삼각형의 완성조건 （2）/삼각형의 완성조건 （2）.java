class Solution {
    public int solution(int[] sides) {
        
        int min = 0;
        int max = 0;
        
        int count = 0;
        
        if(sides[0] < sides[1]){
            min = sides[0];
            max = sides[1];
        }
        else{
            min = sides[1];
            max = sides[0];
        }
        
        for(int i=0; i<=max; i++){
            if(min+i > max){
                count++;
            }
        }
        for(int i=max+1; i<min+max; i++){
            count++;
        }
        
        return count;
        
    }
}