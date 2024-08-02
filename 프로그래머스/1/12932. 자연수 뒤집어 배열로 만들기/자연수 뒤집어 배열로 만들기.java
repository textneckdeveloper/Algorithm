class Solution {
    public int[] solution(long n) {
        
        int count = 0;
        
        String s = "" + n;
        
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse();
        
        s = sb.toString();
        
        String[] strArr = s.split("");
        
        int[] result = new int[strArr.length];
        
        for(String str : strArr){
            result[count++] = Integer.parseInt(str);
        }
        
        return result;
        
    }
}