class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        if(row == col){
            return arr;
        }
        else if(row != col){
            if(row > col){
                while(row > col){
                    col++;
                }
            }
            else if(row < col){
                while(row < col){
                    row++;
                }
            }
        }
        
        int[][] answer = new int[row][col];
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                if(i < arr.length && j < arr[i].length){
                    answer[i][j] = arr[i][j];
                }
                else{
                    answer[i][j] = 0;
                }
            }
        }
        
        return answer;
        
    }
}