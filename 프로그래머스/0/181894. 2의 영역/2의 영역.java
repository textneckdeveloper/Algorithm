import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int[] check = new int[arr.length];
        
        int start = 0;
        int end = 0;
        
        int falseValue = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                check[i] = 1;
                falseValue++;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(check[i] == 1){
                start = i;
                break;
            }
        }
        
        for(int i=arr.length-1; i>=0; i--){
            if(check[i] == 1){
                end = i;
                break;
            }
        }
        
        for(int i=start; i<=end; i++){
            list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        if(falseValue == 0){
            answer[0] = -1;
            return answer;
        }
        
        return answer;
        
    }
}