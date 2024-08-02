class Solution {
    public int solution(String binomial) {
        
        String[] s = binomial.split(" ");
        
        switch(s[1]){
            case "+" : return Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
            case "-" : return Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
            case "*" : return Integer.parseInt(s[0]) * Integer.parseInt(s[2]);
        }
        
        return 0;
        
    }
}