import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String str : intStrs){
            
            String check = "";
            
            for(int i=s; i<s+l; i++){
                check += str.charAt(i);
            }
            
            if(Integer.parseInt(check) > k){
                list.add(Integer.parseInt(check));
            }
            
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}