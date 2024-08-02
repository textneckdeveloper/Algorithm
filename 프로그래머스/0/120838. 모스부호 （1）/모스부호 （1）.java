class Solution {
    public String solution(String letter) {
        
        String[] strArr =     {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] s = letter.split(" ");
        
        String answer = "";
        
        for(int i=0; i<s.length; i++){
            for(int j=0; j<strArr.length; j++){
                if(s[i].equals(strArr[j])){
                    answer += (char)(97+j);
                }
            }
        }
        
        return answer;
        
    }
}