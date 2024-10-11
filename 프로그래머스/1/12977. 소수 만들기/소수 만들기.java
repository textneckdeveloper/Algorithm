import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        boolean[] check = new boolean[3000];
        Arrays.fill(check, true);
        check[0] = check[1] = false;
        for (int i=2; i*i<3000; i++) if (check[i]) for (int j=i*i; j<3000; j+=i) check[j] = false;
        
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) if (check[nums[i] + nums[j] + nums[k]]) count++;
            }
        }
        
        return count;
        
    }
}