class Solution {
    public double solution(int[] arr) {
        
        int sum = 0;
        
        for(int i : arr){
            sum += i;
        }
        
        return sum / (double)arr.length;
        
    }
}