import java.util.*;

class Solution {
    
    static class Item {
        
        int val, plus;
        
        Item (int val, int plus) {
            this.val = val;
            this.plus = plus;
        }
        
    }
    
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Item> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<speeds.length; i++) q.add(new Item(progresses[i], speeds[i]));
        
        while (!q.isEmpty()) {
            
            for (Item item : q) item.val += item.plus;
            
            int count = 0;
            while (!q.isEmpty() && q.peek().val >= 100) {
                q.poll();
                count++;
            }
            
            if (count > 0) list.add(count);
            
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) answer[i] = list.get(i);
        
        return answer;
        
    }
}