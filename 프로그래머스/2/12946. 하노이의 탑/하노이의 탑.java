class Solution {
    
    static int count = 0;
    
    static int[][] answer;
    
    static void move(int n, int x, int y){
        if(n>1){
           move(n-1, x, 6-x-y); 
        }
        answer[count][0] = x;
        answer[count++][1] = y;
        if(n>1){
            move(n-1, 6-x-y, y);
        }        
    }
    
    public int[][] solution(int n) {
        
        answer = new int[(int)Math.pow(2, n)-1][2];
        
        move(n, 1, 3);

        return answer;
        
    }
    
}