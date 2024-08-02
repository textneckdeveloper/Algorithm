class Solution {
    public int solution(int[] num_list) {
        
        int sum = 0;
        String even = "";
        String odd = "";
        
        for(int i : num_list){
            if(i % 2 == 0){
                even += i;
            }
            else{
                odd += i;
            }
        }
        
        sum = Integer.parseInt(even) + Integer.parseInt(odd);
        
        return sum;
        
    }
}