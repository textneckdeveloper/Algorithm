import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers.length; j++) if (i != j) hs.add(numbers[i] + numbers[j]);
        } int[] answer = new int[hs.size()]; int count = 0;
        
        for (int i : hs) answer[count++] = i;
        Arrays.sort(answer);
        return answer;
    }
}