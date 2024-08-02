import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        List<Integer> list = new ArrayList<>();
        
        list = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
        
        while(list.size() > k){
            list.remove(list.size()-1);
        }
        
        while(list.size() < k){
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}