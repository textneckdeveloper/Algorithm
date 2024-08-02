import java.util.Arrays;

class Solution {
    public int[] solution(int num, int total) {
        
        int sum = 0;
        int count = 0;
        int arrCount = 0;
        
        int[] result = new int[num];
        
        do{
            
            sum = 0;
            arrCount = 0;
            
            for(int i=(total+num)-count; i>(total)-count; i--){
                sum += i;
                result[arrCount++] = i;
            }
            
            count++;
            
        }while(sum != total);
        
        Arrays.sort(result);
        
        return result;
        
    }
}