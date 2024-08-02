import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {

        Arrays.sort(dots, (a, b) -> {
            return Integer.compare(a[0], b[0]);
        });
        
        int x1 = dots[1][0] - dots[0][0];
        int y1 = dots[1][1] - dots[0][1];
        
        int x2 = dots[3][0] - dots[2][0];
        int y2 = dots[3][1] - dots[2][1];
        
        int x3 = dots[3][0] - dots[0][0];
        int y3 = dots[3][1] - dots[0][1];
            
        int x4 = dots[2][0] - dots[1][0];
        int y4 = dots[2][1] - dots[1][1];
        
        double a1 = Math.abs(y1/(double)x1);
        double b1 = Math.abs(y2/(double)x2);
        
        double a2 = Math.abs(y3/(double)x3);
        double b2 = Math.abs(y4/(double)x4);
        
        return a1 == b1 || a2 == b2 ? 1 : 0;
        
    }
}