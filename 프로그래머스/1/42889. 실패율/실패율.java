import java.util.*;

class Solution {
    
    static class Obj implements Comparable<Obj> {
        
        int idx;
        Double d;
        
        Obj(int idx, Double d) {
            this.idx = idx;
            this.d = d;
        }
        
        public int compareTo(Obj o) {
            if (Double.compare(this.d, o.d) == 0) return Integer.compare(this.idx, o.idx);
            return Double.compare(o.d, this.d);
        }
        
    }
    
    public int[] solution(int N, int[] stages) {
        
        int[] arr = new int[N+1];
        int val = stages.length;
        
        Obj[] object = new Obj[N];
        for (int i=0; i<stages.length; i++) if (stages[i] != N+1) arr[stages[i]]++;
        for (int i=1; i<N+1; i++) {
            if (val != 0) {
                object[i-1] = new Obj(i, arr[i] / (double)val);
                val -= arr[i];
            }
            else object[i-1] = new Obj(i, 0.0);
        } Arrays.sort(object);
        
        int[] result = new int[N];
        for (int i=0; i<N; i++) result[i] = object[i].idx;
        
        return result;
        
    }
}