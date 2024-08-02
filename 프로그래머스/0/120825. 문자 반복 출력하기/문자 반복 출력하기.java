class Solution {
    public String solution(String my_string, int n) {
        
        String[] strArray = my_string.split("");
        String s = "";
        
        for(String str : strArray){
            for(int i=0; i<n; i++){
                s += str;
            }
        }
        
        return s;
        
    }
}