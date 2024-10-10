class Solution {
    public String solution(String s, int n) {
        
        String answer = "";
        
        for (String str : s.split("")) {
            if (str.equals(" ")) {
                answer += " "; 
                continue;
            }
            else if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
                char c = (char)(str.charAt(0) + n);
                if (c > 'Z') c = (char)(c - 26);
                answer += c;
            }
            else if (str.charAt(0) >= 97 && str.charAt(0) <= 122) {
                char c = (char)(str.charAt(0) + n);
                if (c > 'z') c = (char)(c - 26);
                answer += c;
            }
        } return answer;
    }
}