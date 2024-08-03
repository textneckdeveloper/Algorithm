class Solution {
    public String solution(String s) {
        return  s.length() % 2 == 0 ?
                String.valueOf(s.charAt((s.length()/2)-1)) + String.valueOf(s.charAt(s.length()/2))
                :
                String.valueOf(s.charAt(s.length()/2));
    }
}