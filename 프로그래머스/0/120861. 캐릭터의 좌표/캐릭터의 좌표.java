class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int x = 0;
        int y = 0;

        int xMin = -board[0] / 2;
        int xMax = board[0] / 2;
        int yMin = -board[1] / 2;
        int yMax = board[1] / 2;

        for(String s : keyinput){
            
            switch (s) {
                case "up" :
                    if(y < yMax){
                        y++;
                    }
                    break;
                case "down" :
                    if(y > yMin){
                        y--;
                    }
                    break;
                case "left" :
                    if(x > xMin){
                        x--;
                    }
                    break;
                case "right" :
                    if(x < xMax){
                        x++;
                    }
                    break;
            }
            
        }

        return new int[]{x, y};
        
    }
}