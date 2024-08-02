class Solution {
    public int solution(String s) {
        
        int sum = 0;
        
        String[] str = s.split(" ");
        
        for(int i=0; i<str.length; i++){
            if(str[i].equals("Z")){
                sum -= Integer.parseInt(str[i-1]);
            }
            else{
                sum += Integer.parseInt(str[i]);
            }
        }
        
        return sum;
        
    }
}