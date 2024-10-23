import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) pq.add(i);
        
        int count = 0;
        while (pq.peek() < K) {
            if (pq.size() == 1 && pq.peek() < K) return -1;
            int i = pq.poll();
            int j = pq.poll();
            pq.add(i + (j*2));
            count++;
        }
        
        return count;
        
    }
}