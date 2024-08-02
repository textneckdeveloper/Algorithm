class Solution {
    public String solution(String my_string, int s, int e) {
        
        String answer = "";
        
        String start_str = my_string.substring(0, s);
        String end_str = my_string.substring(e+1, my_string.length());
        
        for(int i=e; i>=s; i--){
            answer += my_string.charAt(i);
        }
        
        return start_str + answer + end_str;
        
    }
}