class Solution {
    public int solution(int chicken) {
        
        int coupon = 0;
        int answer = 0;

        while(chicken >= 1){
            
            if(chicken == 10){
                coupon += 1;
            }
            else{
                coupon += chicken%10;
            }
            
            chicken = chicken/10;
            
            answer += chicken;
 
        }
        
        return answer+coupon/10+(coupon/10+coupon%10)/10;
        
    }
}