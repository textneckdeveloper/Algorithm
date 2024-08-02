class Solution {
    public int solution(int a, int b) {
        
        String x = ""+a+b;
        int y = 2*a*b;
        int answer = Integer.parseInt(x) > y ? Integer.parseInt(x) : y;
        
        return answer;
        
    }
}