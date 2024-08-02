import java.math.BigInteger;

class Solution {
    
    public BigInteger factorial(int n){
        
        BigInteger sum = BigInteger.ONE;
        
        for(int i=1; i<=n; i++){
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        
        return sum;
        
    }
    
    public int solution(int balls, int share) {
        return (factorial(balls).divide(factorial(share).multiply(factorial(balls - share)))).intValue();
    }
    
}