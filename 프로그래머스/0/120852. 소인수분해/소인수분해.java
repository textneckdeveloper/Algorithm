import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int count = 0;
        
        for(int i=1; i<=n; i++){
            
            count = 0;
            
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            
            if(count == 2 && n % i == 0){
                list.add(i);
            }
            
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}