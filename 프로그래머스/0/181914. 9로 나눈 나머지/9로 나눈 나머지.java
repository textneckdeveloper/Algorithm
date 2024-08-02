import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        
        int answer = 0;
        
        BigInteger bigInteger = new BigInteger(number);
        BigInteger bigInteger2 = new BigInteger("9");
        
        answer = bigInteger.remainder(bigInteger2).intValue();
        
        return answer;
        
    }
}