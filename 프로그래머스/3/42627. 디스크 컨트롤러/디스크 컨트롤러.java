import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        
        PriorityQueue<int[]> timeQ = new PriorityQueue<>((o1, o2) -> (o1[1] - o2[1]));
        PriorityQueue<int[]> workQ = new PriorityQueue<>((o1, o2) -> (o1[0] - o2[0]));
        for (int[] j : jobs) workQ.add(j);
        
        int answer = 0;
        int time = 0;
        while (!workQ.isEmpty() || !timeQ.isEmpty()) {
            while (!workQ.isEmpty() && workQ.peek()[0] <= time) timeQ.add(workQ.poll());
            if (timeQ.isEmpty()) time = workQ.peek()[0];
            else {
                int[] j = timeQ.poll();
                answer += time + j[1] - j[0];
                time += j[1];
            }
        }
        
        return answer / jobs.length;
        
    }
}