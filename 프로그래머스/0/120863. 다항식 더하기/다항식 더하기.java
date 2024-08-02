class Solution {
    public String solution(String polynomial) {
        
        polynomial = polynomial.replace(" ", "");
        String[] s = polynomial.split("\\+");
        
        polynomial = polynomial.replaceAll("[^+]", "");
        String[] operator = polynomial.split("");
        
        int plus = 0;
        int multy = 0;
        
        
        
        for(int i=0; i<s.length; i++){
            
            if(s[i].contains("x") && s[i].length() != 1){
                System.out.println(s[i]);
                multy += Integer.parseInt(s[i].substring(0, s[i].length()-1));
            }
            else if(s[i].contains("x") && s[i].length() == 1){
                multy += 1;
            }
            else{
                plus += Integer.parseInt(s[i]);
            }
            
        }
        
        if(multy == 1){
            if(plus == 0){
                return "x";
            }
            else{
                return "x" + " " + "+" + " " + plus;
            }
        }
        else if(multy == 0){
            return "" + plus;
        }
        
        return plus == 0 ? multy + "x" : multy + "x" + " " + "+" + " " + plus;
        
    }
}