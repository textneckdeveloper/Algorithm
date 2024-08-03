import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        
        String[] strArr = s.split("");
        
        String result = "";
        
        Arrays.sort(strArr, Collections.reverseOrder());
        
        for(String str : strArr){
            result += str;
        }
        
        return result;
        
    }
}