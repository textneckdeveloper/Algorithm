import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {  
        String[] s = Arrays.stream(myStr.split("[abc]")).filter(i->!i.trim().isEmpty()).toArray(String[]::new); 
        return s.length == 0 ? new String[]{"EMPTY"} : s;
    }
}