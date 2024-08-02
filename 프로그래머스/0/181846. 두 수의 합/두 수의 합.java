import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        
        BigInteger s1 = new BigInteger(a);
        BigInteger s2 = new BigInteger(b);
        
        return String.valueOf(s1.add(s2));
        
    }
}