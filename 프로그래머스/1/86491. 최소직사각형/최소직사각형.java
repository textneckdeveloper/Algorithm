import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        for (int[] size : sizes) {
            if (size[1] > size[0]) {
                int tmp = size[0];
                size[0] = size[1];
                size[1] = tmp;
            }
        } int w = 0, h = 0;
        for (int[] size : sizes) {
            w = size[0] > w ? size[0] : w;
            h = size[1] > h ? size[1] : h;
        } return w*h;
    }
}