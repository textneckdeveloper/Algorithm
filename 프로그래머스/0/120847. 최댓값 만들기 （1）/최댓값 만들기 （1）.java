import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : numbers){
            list.add(i);
        }
        
        int max = Collections.max(list);
        
        list.remove(Integer.valueOf(Collections.max(list)));
        
        return max * Collections.max(list);
        
    }
}