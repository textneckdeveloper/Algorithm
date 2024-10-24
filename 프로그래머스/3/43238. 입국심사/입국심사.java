class Solution {
    
    static boolean check(int[] times, long min, int n) {
        long count = 0;
        for (int time : times) count += min / time;
        return count >= n;
    }
    
    public long solution(int n, int[] times) {
        
        long start = 0;
        long end = 1000000000 * 1000000000L;

        while (start < end) {
            long min = (start+end) / 2;
            if (check(times, min, n)) end = min;
            else start = min + 1;
        }
        
        return start;
        
    }
}