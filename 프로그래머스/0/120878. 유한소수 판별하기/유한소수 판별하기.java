class Solution {
    public int solution(int a, int b) {
        
        int origin_b = b;
        
        while(b != 0){ // 유클리드 호제법 (최대공약수)
            int temp = b;
            b = a%b;
            a = temp;
        }
        
        int check = origin_b / a;
        
        while(check % 2 == 0){
            check /= 2;
        }
        while(check % 5 == 0){
            check /= 5;
        }
            
        return check == 1 ? 1 : 2; 
        
    }
}