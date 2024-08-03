class Solution {
    public int solution(String t, String p) {
        
        int count = 0;

        for(int i=0; i<=t.length()-p.length(); i++){
            System.out.println(t.substring(i, i+p.length()));
            count += Long.parseLong(t.substring(i, i+p.length())) <= Long.parseLong(p) ? 1 : 0; 
        }
        
        return count;
        
    }
}