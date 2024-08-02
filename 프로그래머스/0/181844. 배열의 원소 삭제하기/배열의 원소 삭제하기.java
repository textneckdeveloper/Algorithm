import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : arr){
            list.add(i);
        }
        
        for(int i=0; i<delete_list.length; i++){
            if(list.contains(delete_list[i])){
                list.remove(Integer.valueOf(delete_list[i]));
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}