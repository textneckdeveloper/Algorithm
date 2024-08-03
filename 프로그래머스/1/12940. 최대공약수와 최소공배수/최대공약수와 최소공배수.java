class Solution {
    public int[] solution(int n, int m) {
        
        int nM = n*m;
        
        while(n != 0){
            int temp = n;
            n = m%n;
            m = temp;
        }
        
        return new int[]{m, nM/m};
        
    }
}