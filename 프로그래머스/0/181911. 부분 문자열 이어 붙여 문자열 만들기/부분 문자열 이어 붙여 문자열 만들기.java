class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        
        String answer = "";
        
        int count = 0;
        
        for(int[] part : parts){
            
            int s = part[0];
            int e = part[1];
            
            for(int i=s; i<=e; i++){
                
                answer += my_strings[count].charAt(i);
                
            }
            
            count++;
            
        }
        
        return answer;
        
    }
}