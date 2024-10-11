import java.util.*;

class Solution {
    public int solution(int n) {
        
        boolean[] check = new boolean[n+1];
        Arrays.fill(check, true);
        check[0] = check[1] = false;
        for (int i=2; i*i<=n; i++) {
            if (check[i]) for (int j=i*i; j<=n; j+=i) check[j] = false;
        } int count = 0;
        
        for (boolean bool : check) count += bool == true ? 1 : 0;
        
        return count;
        
    }
}