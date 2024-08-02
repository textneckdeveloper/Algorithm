class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int answer[] = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int value = 1000000;
            
            for(int j=s; j<=e; j++){
                if(arr[j] > k && arr[j] < value){
                    value = arr[j];
                }
            }
            
            if(value != 1000000){
                answer[i] = value;
            }else{
                answer[i] = -1;
            }
            
        }
        
        return answer;
        
    }
}