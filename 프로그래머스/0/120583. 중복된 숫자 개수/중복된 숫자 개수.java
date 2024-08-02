class Solution {
    public int solution(int[] array, int n) {
        
        int sum = 0;
        
        for(int i : array){
            if(i == n){
                sum++;
            }
        }
        
        return sum;
        
    }
}