class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        int[] arr = new int['z'+1];
        
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (arr[s.charAt(i)] == 0) {
                answer[count++] = -1;
                arr[s.charAt(i)] = i+1;
            }
            else  {
                answer[count++] = i - arr[s.charAt(i)] + 1;
                arr[s.charAt(i)] = i+1;
            }
        } return answer;
    }
}