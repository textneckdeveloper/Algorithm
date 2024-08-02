class Solution {
    public int solution(String my_string) {
        
        my_string = my_string.replaceAll("[A-Z]", "o").replaceAll("[a-z]", "o");
        
        String[] str = my_string.split("o");
        
        int sum = 0;
        
        for(String s : str){
            if(!s.isEmpty()){
                sum += Integer.parseInt(s);
            }
        }
        
        return sum;
        
    }
}