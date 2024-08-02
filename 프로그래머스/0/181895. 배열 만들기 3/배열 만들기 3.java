import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] i : intervals){
            
            int a = i[0];
            int b = i[1];
            
            for(int j=a; j<=b; j++){
                list.add(arr[j]);
            }
            
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}