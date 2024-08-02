class Solution {
    public int solution(int n) {
        
        String s = String.valueOf(n);
        String[] strArray = s.split("");
        
        int sum = 0;
        
        for(String str : strArray){
            sum += Integer.parseInt(str);
        }
        
        return sum;
        
    }
}