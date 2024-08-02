class Solution {
    public long[] solution(int x, int n) {
        
        long[] sum = new long[n];
        
        for(int i=0; i<n; i++){
            sum[i] = (long) x*(i+1);
        }
        
        return sum;
        
    }
}