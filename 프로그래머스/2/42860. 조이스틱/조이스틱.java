class Solution {
    public int solution(String name) {

        int length = name.length();
        int upDown = 0;
        int leftRight = length-1;
        
        for(int i=0; i<length; i++) {
            upDown += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
            
            int next = i+1;
            while(next<length && name.charAt(next)=='A') next++;
            
            leftRight = Math.min(leftRight, Math.min((i+length-next+i), (i+length-next+length-next)));
        }
        
        return upDown+leftRight;
        
    }
}