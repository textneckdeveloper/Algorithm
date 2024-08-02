import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        my_string = my_string.replaceAll("[a-z]", "");
        
        String[] s = my_string.split("");
        
        Arrays.sort(s);
        
        int[] answer = new int[s.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(s[i]);
        }
        
        return answer;

    }
}