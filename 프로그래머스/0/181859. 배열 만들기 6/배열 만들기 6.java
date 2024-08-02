import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(list.size() == 0){
                list.add(arr[i]);
            }else if(list.size() != 0 && list.get(list.size()-1) == arr[i]){
                list.remove(list.size()-1);
            }else if(list.size() != 0 && list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
        
    }
}