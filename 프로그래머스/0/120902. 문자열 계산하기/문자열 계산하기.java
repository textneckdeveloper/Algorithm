class Solution {
    public int solution(String my_string) {

        my_string = my_string.replaceAll(" ", "");


        String[] numbers = my_string.split("[+-]");
        String[] operators = my_string.replaceAll("[0-9]", "").split("");


        int answer = Integer.parseInt(numbers[0]);

        for (int i=0; i < operators.length; i++) {
            
            int num = Integer.parseInt(numbers[i+1]);
            
            if (operators[i].equals("+")) {
                answer += num;
            }
            else if (operators[i].equals("-")) {
                answer -= num;
            }
            
        }

        return answer;
        
    }
}