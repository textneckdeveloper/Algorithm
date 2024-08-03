class Solution {
    public boolean solution(String s) {  
        return  s.replaceAll("[a-zA-z]", "!").contains("!") ? false :
                s.length() == 4 || s.length() == 6 ? true : false;
    }
}