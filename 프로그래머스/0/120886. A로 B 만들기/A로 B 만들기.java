import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        String[] before_s = before.split("");
        String[] after_s = after.split("");
        
        int count = 0;
        
        Arrays.sort(before_s);
        Arrays.sort(after_s);
        
        for(String s : before_s){
            if(!s.equals(after_s[count++])){
                return 0;
            }
        }
        
        return 1;
        
    }
}