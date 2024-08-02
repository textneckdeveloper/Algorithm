import java.util.ArrayList;

class Solution {
    public int solution(int[] arr) {
        
        int count;
        int loop = 0;
        
        ArrayList<Integer> list_1 = new ArrayList<>();
        
        for(int i : arr){
            list_1.add(i);
        }
        
        ArrayList<Integer> list_2 = new ArrayList<>();
        
        do {
            
            list_1.clear();
            list_2.clear();
            
            count = 0;
            
            for(int i : arr){
                
                list_1.add(i);

                if(i >= 50 && i % 2 == 0){
                    i /= 2;
                }else if( i < 50 && i % 2 != 0){
                    i *= 2;
                    i += 1;
                }
                
                list_2.add(i);
    
                arr[count] = i;
                
                count++;
                
            }
            
            loop++;
            
        } while(!(list_1.equals(list_2)));
        
        return loop - 1;
        
    }
}