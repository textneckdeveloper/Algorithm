class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        for(String[] check : db){
            
            String checkId = check[0];
            String checkPwd = check[1];
            
            if(id_pw[0].equals(checkId)){
                
                if(id_pw[1].equals(checkPwd)){
                    return "login";
                }
                
                return "wrong pw";
                
            }
              
        }
        
        return "fail";
        
    }
}