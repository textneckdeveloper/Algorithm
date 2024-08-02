class Solution {
    public int solution(String myString, String pat) {
        
        String s = "";
        int answer = 0;
        
        for(int i=0; i<myString.length(); i++){
            if(i+pat.length() <= myString.length()){
                s = myString.substring(i, i+pat.length());
                if(s.equals(pat)){
                    answer++;
                }
            }
        }
        
        return answer;
        
    }
}