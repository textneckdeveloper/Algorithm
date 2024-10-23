import java.util.*;

class Solution {
    
    static boolean[] isPrime = new boolean[10000000];
    static Set<Integer> primes = new HashSet<>();
    
    static void dfs(String current, String numbers) {
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            if (isPrime[num]) primes.add(num);
        }

        for (int i = 0; i < numbers.length(); i++) {
            dfs(current + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }
    
    public int solution(String numbers) {
        
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i=2; i*i<isPrime.length; i++) {
            if (isPrime[i]) for (int j=i*i; j<isPrime.length; j+=i) isPrime[j] = false;
        }
        
        dfs("", numbers);

        return primes.size();
        
    }
}