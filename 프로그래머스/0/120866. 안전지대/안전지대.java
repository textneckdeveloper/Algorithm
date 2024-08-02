class Solution {
    public int solution(int[][] board) {
        
        int rows = board.length;
        int cols = board[0].length;
        
        int safeCount = 0;

        for (int i=0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isSafe(board, i, j)) {
                    safeCount += 1;
                }
            }
        }
        
        return safeCount;
        
    }
    
    public boolean isSafe(int[][] board, int row, int col) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                try {
                    if (board[row + i][col + j] == 1) {
                        return false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
        
        return true;
        
    }
    
}