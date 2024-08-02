import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        
        int a = (int) Arrays.stream(arr).count();
        int b = 1;
        
        while(a > b){
            b *= 2;
        }

        return IntStream.concat(Arrays.stream(arr), IntStream.generate(()->0).limit(b-a)).toArray();
            
    }
}