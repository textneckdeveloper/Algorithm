class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] query : queries){
            
            int a = query[0];
            int b = query[1];
            
            for(int i=0; i<arr.length; i++){
                if(i >= a && i <= b){
                    arr[i]++;
                }
            }
            
        }
        
        return arr;
        
    }
}