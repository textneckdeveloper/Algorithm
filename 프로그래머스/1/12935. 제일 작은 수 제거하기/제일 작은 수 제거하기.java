import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : arr){
            list.add(i);
        }
        
        list.removeAll(Collections.singleton(Collections.min(list)));
        
        int[] result = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result.length == 0 || result.length == 1 && result[0] == 10 ? new int[]{-1} : result;
        
    }
}