class Solution {
    public String solution(String myString, String pat) {
        
        String answer = "";
        String str = "";
        int count = pat.length();
        
        for(int i=0; i<myString.length(); i++){
            if(i+pat.length()<=myString.length()){
                str = myString.substring(i, i+pat.length());
                count++;
            }
            if(str.equals(pat)){
                answer = myString.substring(0, i+pat.length());
            }
        }
        
        return answer;
        
    }
}