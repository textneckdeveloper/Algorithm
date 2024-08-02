class Solution {
    public String solution(int[] numLog) {
        
        int n = numLog[0];
        String s = "";
        
        for(int i=1; i<numLog.length; i++){

            if(numLog[i] == numLog[i-1]+1){
                s += "w";
            }else if(numLog[i] == numLog[i-1]-1){
                s += "s";
            }else if(numLog[i] == numLog[i-1]+10){
                s += "d";
            }else if(numLog[i] == numLog[i-1]-10){
                s += "a";
            }
            
        }
        
        return s;
        
    }
}