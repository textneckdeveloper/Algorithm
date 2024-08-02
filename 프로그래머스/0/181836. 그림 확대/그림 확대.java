class Solution {
    public String[] solution(String[] picture, int k) {
        
        String[] answer = new String[picture.length*k];
        String s = "";
        int value = 0;
        int count = 0;
        
        for(int x=0; x<picture.length; x++){
            for(int y=0; y<picture[x].length(); y++){
                for(int z=0; z<k; z++){
                    s += "" + picture[x].charAt(y);
                }
            }
            picture[x] = s;
            s = "";
        }
        
        for(int i=0; i<picture.length; i++){
            value = 0;
            while(value < k){
                answer[count++] = picture[i];
                value++;
            }
        }
        
        return answer;
        
    }
}