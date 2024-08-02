import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        
        String s = "" + n;
        
        String ss = "";
        
        String[] strArr = s.split("");
        
        Arrays.sort(strArr, Collections.reverseOrder());

        for(String str : strArr){
            ss += str;
        }
        
        long answer = Long.parseLong(ss);

        return answer;
        
    }
}