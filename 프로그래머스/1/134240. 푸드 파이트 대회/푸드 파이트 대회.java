class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i=0; i<food.length; i++) {
            int loop = food[i] / 2; // 0 1 2 3
            for (int j=0; j<loop; j++) answer += i;
        } answer += 0;
        for (int i=food.length-1; i>=0; i--) {
            int loop = food[i] /2;
            for (int j=0; j<loop; j++) answer += i;
        } return answer;
    }
}