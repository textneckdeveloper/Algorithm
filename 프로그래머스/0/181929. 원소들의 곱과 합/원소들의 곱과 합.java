import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        
        IntStream stmProduct = Arrays.stream(num_list);
        IntStream stmSquare = Arrays.stream(num_list);
        
        return stmProduct.reduce(1, (a, b) -> a*b) < Math.pow(stmSquare.reduce(0, (a, b) -> a+b), 2) ? 1 : 0;
        
    }
}