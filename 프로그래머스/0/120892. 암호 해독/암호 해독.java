class Solution {
    public String solution(String cipher, int code) {
        
        String s = "";
        
        for(int i=code-1; i<=cipher.length()-1; i+=code){
            s += cipher.charAt(i);
        }
        
        return s;
        
    }
}