class Solution {
    public int solution(int i, int j, int k) {
        
        int count = 0;
        
        String check = ""+k;
        
        for(int a=i; a<=j; a++){
            String s = ""+a;
            for(int b=0; b<s.length(); b++){
                if(s.charAt(b) == check.charAt(0)){
                    count++;
                }
            }
        }
        
        return count;
        
    }
}