class Solution {
    public String solution(String n_str) {
        
        String[] str = n_str.split("");
        
        int count = 0;
        
        for(String s : str){
            if(!s.equals("0")){
                break;
            }
            count++;
        }
        
        return n_str.substring(count, n_str.length());
        
    }
}