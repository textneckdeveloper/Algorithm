class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        String answer = "";
        
        for(int i=0; i<s; i++){
            answer += my_string.charAt(i);
        }
        
        answer += overwrite_string;
        
        int num = answer.length();
        
        if(answer.length() != my_string.length()){
            while(num < my_string.length()){
                answer += my_string.charAt(num);
                num++;
            }
        }
        
        return answer;
        
    }
}