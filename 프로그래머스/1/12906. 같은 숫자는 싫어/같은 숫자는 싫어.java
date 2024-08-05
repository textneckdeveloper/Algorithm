import java.util.Stack;
import java.util.EmptyStackException;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr){
            try{
                if(stack.peek() != i){
                    stack.push(i);
                }   
            }catch(EmptyStackException e){
                stack.push(i);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i=0; i<stack.size(); i++){
            answer[i] = stack.get(i);
        }
        
        return answer;
        
    }
}