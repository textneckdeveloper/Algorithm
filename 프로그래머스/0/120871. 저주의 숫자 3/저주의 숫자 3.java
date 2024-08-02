class Solution {
    public int solution(int n) {
        
        int not_three = 0;
        
        int count = 0;
        
        for(int i=1; i<=n; i++){
            
            not_three++;
            
            while((not_three % 3 == 0 || Integer.toString(not_three).contains("3"))){
                
                if(not_three % 3 == 0 || Integer.toString(not_three).contains("3")){
                    not_three++;
                }
                
            }
            
        }
        
        return not_three;
        
    }
}