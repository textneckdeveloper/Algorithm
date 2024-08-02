class Solution {
    public int solution(int[] array) {
        
        int count = 0;
        
        for(int i : array){
            String s = ""+i;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == '7'){
                    count++;
                }
            }  
        }
        
        return count;
        
    }
}