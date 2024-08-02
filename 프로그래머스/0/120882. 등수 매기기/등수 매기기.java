class Solution {
    public int[] solution(int[][] score) {
        
        int[] check = new int[score.length];
        int[] answer = new int[check.length];
        
        int count = 0;
        
        for(int[] i : score){
            check[count++] = (int) Math.round((i[0]+i[1])/2.0);
        }
        
        System.out.println(check[0]);
        
        for(int i=0; i<check.length; i++){
            
            answer[i] = 1;
            
            for(int j=0; j<check.length; j++){
                if(check[i] < check[j]){
                    answer[i]++;
                }
            }
        }
        
        return answer;
        
    }
}