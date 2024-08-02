class Solution {
    public String[] solution(String my_str, int n) {
        
        String s = "";
        String answer = "";
        
        for(int i=0; i<my_str.length(); i++){
            s += my_str.charAt(i);
            if(s.length() % n == 0){
                answer += s + " ";
                s = "";
            }
            else if(i == my_str.length() - 1){
                answer += s;
            }
        }
        
        String[] str = answer.split(" ");
        
        return str;
        
    }
}