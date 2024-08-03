import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        
        String[] strArr = s.split(" ");
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String str : strArr){
            list.add(Integer.parseInt(str));
        }
        
        return Collections.min(list) + " " + Collections.max(list);
        
    }
}