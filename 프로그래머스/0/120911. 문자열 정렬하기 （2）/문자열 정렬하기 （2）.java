import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        String[] str = my_string.split("");
        
        Arrays.sort(str);
        
        for(String s : str){
            answer += s;
        }
        
        return answer;
        
    }
}