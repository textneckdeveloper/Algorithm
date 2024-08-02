class Solution {
    public String solution(String my_string, int m, int c) {
        
        String answer = "";
        
        String[][] array = new String[my_string.length()/m][m];
        
        int count = 0;
        
        for(int i=0; i<my_string.length()/m; i++){
            
            for(int j=0; j<m; j++){
                if(j == c-1){
                    answer += my_string.charAt(count);
                }
                count++;
            }
            
        }
        
        return answer;
        
    }
}