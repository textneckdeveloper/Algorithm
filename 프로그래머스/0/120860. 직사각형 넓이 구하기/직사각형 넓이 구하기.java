class Solution {
    public int solution(int[][] dots) {
        
        int max_x = dots[0][0];
        int max_y = dots[0][1];
            
        int min_x = dots[0][0];
        int min_y = dots[0][1];
        
        for(int[] i : dots){
            
            if(i[0] > max_x){
                max_x = i[0];
            }
            if(i[1] > max_y){
                max_y = i[1];
            }
            
            if(min_x > i[0]){
                min_x = i[0];
            }
            if(min_y > i[1]){
                min_y = i[0];
            }
            
        }
        
        return (max_x - min_x) * (max_y - min_y);
        
    }
}