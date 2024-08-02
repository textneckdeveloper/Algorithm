class Solution {
    public String solution(String my_string) {
        
        String s = my_string.toLowerCase();
        
        String answer = "";
            
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) == (s.charAt(i))){
                answer += (""+my_string.charAt(i)).toUpperCase();
            }
            else{
                answer += (""+my_string.charAt(i)).toLowerCase();
            }
        }
        
        return answer;
        
    }
}