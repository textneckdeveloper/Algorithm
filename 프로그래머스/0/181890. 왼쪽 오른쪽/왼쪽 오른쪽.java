import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        
        List<String> list = new ArrayList<>();
        
        int check = 0;
        
        for(String s : str_list){
            list.add(s);
        }
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                list = list.subList(0, i);
                check++;
                break;
            }
            else if(str_list[i].equals("r")){
                list = list.subList(i+1, list.size());
                check++;
                break;
            }
        }
        
        String[] answer = new String[list.size()];
        
        if(check == 0){
            return new String[0]; 
        }
        else{
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
        
    }
}