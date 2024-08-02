class Solution {
    public String solution(String my_string, int[][] queries) {

        for(int[] query : queries) {
            
            int s = query[0];
            int e = query[1];
            
            String re = "";
            
            for(int i = e; i > s - 1; i--) {
                re += my_string.charAt(i);
            }
            
            String p = my_string.substring(0, s);
            String b = my_string.substring(e+1);

            my_string = p + re + b;
            
        }

        return my_string;
        
    }
}