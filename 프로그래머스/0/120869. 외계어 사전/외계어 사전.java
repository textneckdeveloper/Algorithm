class Solution {
    public int solution(String[] spell, String[] dic) {
        
        boolean check = true;
        
        for(String s : dic){
            
            check = true;
            
            for(int i=0; i<spell.length; i++){
                if(!s.contains(spell[i])){
                    check = false;
                    if(check == false){
                        break;
                    }
                }
            }
            
            if(check == true){
                return 1;
            }
            
        }
        
        return 2;
        
    }
}