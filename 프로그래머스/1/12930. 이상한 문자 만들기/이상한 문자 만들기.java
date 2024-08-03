class Solution {
    public String solution(String s) {
        
        String answer = "";
        
        int count = 0;
        
        String[] strArr = s.split("");
        
        for(String str : strArr){
            if(str.equals(" ")){
                answer += " ";
                count = 0;
            }
            else{
                answer += count % 2 == 0 ? str.toUpperCase() : str.toLowerCase();
                count++;
            }
        }
        
        return answer;
        
    }
}