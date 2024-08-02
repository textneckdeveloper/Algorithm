class Solution {
    public int solution(String myString, String pat) {
        
        String str = "";
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        for(int i=0; i<myString.length(); i++){
            
            if(i+pat.length() <= myString.length()){
                str = myString.substring(i, i+pat.length());
            }
            
            if(pat.equals(str)){
                return 1;
            }
        }
        
        return 0;
        
    }
}