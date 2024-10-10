import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<k; i++) {
            if (i < score.length) {
                pq.add(score[i]);
                result[i] = pq.peek();
            }
        }
        for (int i=k; i<score.length; i++) {
            if (score[i] > pq.peek()) {
                pq.poll();
                pq.add(score[i]);
            } result[i] = pq.peek();
        } return result;
    }
}