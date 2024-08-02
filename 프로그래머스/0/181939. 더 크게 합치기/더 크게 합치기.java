class Solution {
    public int solution(int a, int b) {
        
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        String x = strA+strB;
        String y = strB+strA;
        
        if(Integer.parseInt(x) > Integer.parseInt(y)){ 
            return Integer.parseInt(x);
        }else if(Integer.parseInt(y) > Integer.parseInt(x)){
            return Integer.parseInt(y);
        }else{
            return Integer.parseInt(x);
        }
    
    }
}