import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] names) {
        
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        int check = 0;
        
        for(String s : names){
            list.add(s);
        }
        
        for(int i=0; i<names.length; i+=5){
            list2.add(list.get(i)); 
        }
        
        String[] answer = new String[list2.size()];
        
        for(int i=0; i<list2.size(); i++){
            answer[i] = list2.get(i);
        }
        
        return answer;
        
    }
}