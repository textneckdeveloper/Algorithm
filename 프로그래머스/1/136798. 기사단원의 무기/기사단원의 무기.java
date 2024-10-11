class Solution {
    public int solution(int number, int limit, int power) {
        
        int[] num = new int[number+1];
        for (int i=1; i<num.length; i++) {
            int count = 0;
            for (int j=1; j*j<=i; j++) {
                if (i % j == 0) {
                    count ++;
                    if (j != i/j) count ++;
                }
            } num[i] = count;
        }
        
        int sum = 0;
        for (int val : num) sum += (val <= limit) ? val : power;
        
        return sum;
        
    }
}