class Solution {
    public int solution(String[] babbling) {
        
        int result = 0;
        
        for(String s : babbling){
            s = s.replaceAll("(aya|ye|woo|ma)", "");
            if(s.length() == 0){
                result++;
            }
        }
        
        return result;
        
    }
}