import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        
        int count = 0;
        int maxValue = 0;
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
            for(int i : array){
                int value = map.getOrDefault(i, 0);
                map.put(i, value+1);
            }
        
            for(Map.Entry<Integer, Integer> entry1 : map.entrySet()){
                if(entry1.getValue() > maxValue){
                    maxValue = entry1.getValue();
                    answer = entry1.getKey();
                }
            }
        
            for (Map.Entry<Integer, Integer> entry2 : map.entrySet()) {
                if (entry2.getValue() == maxValue) {
                    count++;
                    if (count > 1) {
                        return -1;
                    }
                }
            }

        return answer;
            
    }
}