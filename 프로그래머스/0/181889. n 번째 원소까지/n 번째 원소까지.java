import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : num_list){
            list.add(i);
        }
        
        list = list.subList(0, n);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}