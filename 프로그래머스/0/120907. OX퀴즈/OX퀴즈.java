import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length];
        
        int count = 0;
        int sum = 0;
        
        for(String s : quiz){

            String[] value = s.split(" ");

            if(value[1].equals("+")){
                sum = Integer.parseInt(value[0]) + Integer.parseInt(value[2]);
            }
            else if(value[1].equals("-")){
                sum = Integer.parseInt(value[0]) - Integer.parseInt(value[2]);
            }
            
            if(sum == Integer.parseInt(value[4])){
                answer[count++] = "O";
            }
            else{
                answer[count++] = "X";
            }
            
        }
        
        return answer;
            
    }     
       
}
