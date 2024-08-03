class Solution {
    public String solution(int n) {
        
        String s = "";
        int count = 0;
        
        while(count < n){
            s += (count % 2 == 0) ? "수" : "박";
            count++;
        }
        
        return s;
        
    }
}