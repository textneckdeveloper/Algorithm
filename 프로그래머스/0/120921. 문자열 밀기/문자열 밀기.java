class Solution {
    public int solution(String A, String B) {
        
        String s = "";
        String temp = "";
        int count = 0;
        
        if(A.equals(B)){
            return 0;
        }
        
        while(!A.equals(B)){
            
            s = "";
            
            for(int i=0; i<A.length(); i++){
                if(i < A.length()-1){
                    s += A.charAt(i);
                }
                else{
                    temp = "" + A.charAt(i);
                }  
            }
            
            A = temp + s;
            
            count++;
            
            if(count > B.length()){
                return -1;
            }
            
        }
        
        return count;
        
    }
}