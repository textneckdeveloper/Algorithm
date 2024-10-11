class Solution {
    public int solution(int n, int m, int[] section) {
        
        int count = 0, index = 0;
        
        while (index < section.length) {
            count++;
            int endVal = section[index] + m - 1;
            while (index < section.length && section[index] <= endVal) index++;
        }
        
        return count;
        
    }
}