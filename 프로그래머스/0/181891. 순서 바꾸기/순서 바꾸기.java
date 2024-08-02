import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {

        List<Integer> list = new ArrayList<>();
        
        for(int i : num_list){
            list.add(i);
        }

        List<Integer> part1 = new ArrayList<>(list.subList(0, n));
        List<Integer> part2 = new ArrayList<>(list.subList(n, list.size()));
        
        part2.addAll(part1);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<part2.size(); i++){
            answer[i] = part2.get(i);
        }
        
        return answer;
        
    }
}