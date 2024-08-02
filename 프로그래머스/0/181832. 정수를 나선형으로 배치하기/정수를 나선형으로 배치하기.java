class Solution {
    public int[][] solution(int n) {
        
        int[][] answer = new int[n][n];
        
        int row = 0;
        int col = 0;
        
        int value = 1;
        
        String move = "right";
        
        while(value <= n*n){
            
            answer[row][col] = value++;
              
            if(move.equals("right")){
                
                if(col+1>=n || answer[row][col+1] != 0){
                    move = "bottom";
                    row++;
                }
                else{
                    col++;
                }
                
            }
            else if(move.equals("bottom")){
                
                if(row+1>=n || answer[row+1][col] != 0){
                    move = "left";
                    col--;
                }
                else{
                    row++;
                }
                
            }
            else if(move.equals("left")){
                
                if(col-1 < 0 || answer[row][col-1] != 0){
                    move = "top";
                    row--;
                }
                else{
                    col--;
                }
                
            }
            else if(move.equals("top")){
                
                if(row-1 < 0 || answer[row-1][col] != 0){
                    move = "right";
                    col++;
                }
                else{
                    row--;
                }
                
            }
            
        }
        
        return answer;
        
    }
}