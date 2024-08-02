class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int common = 1;
        
        while(!(common % denom1 == 0 && common % denom2 == 0)){
            common++;
        }
        
        int a = 0;
        
        int temp = 0;
        
        a = numer1*(common/denom1)+numer2*(common/denom2);
        
        int x = a;
        int y = common;
        
        while(common != 0){
            temp = common;
            common = a % common;
            a = temp;
        }
        
        return new int[]{x/temp, y/temp};
        
    }
}