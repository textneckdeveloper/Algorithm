class Solution {
    public int solution(int num, int k) {
        
        String s_num = "" + num;
        String s_k = "" + k;
        
        int count = 0;
        boolean check = false;
        
        for(int i=0; i<s_num.length(); i++){
            count++;
            if(s_num.charAt(i) == s_k.charAt(0)){
                check = true;
                break;
            }
        }
        
        if(check == false){
            return -1;
        }
        
        return count;
        
    }
}