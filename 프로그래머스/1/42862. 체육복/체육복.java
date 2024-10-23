import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int[] student = new int[n];
        Arrays.fill(student, 1);
        
        for (int i=0; i<lost.length; i++) student[lost[i]-1]--;
        for (int i=0; i<reserve.length; i++) student[reserve[i]-1]++;
        
        for (int i=0; i<n; i++) {
            if (student[i] == 2) {
                if (i-1 >= 0 && student[i-1] == 0) {
                    student[i-1]++;
                    student[i]--;
                }
                else if (i+1 < n && student[i+1] == 0) {
                    student[i+1]++;
                    student[i]--;
                }
            }
        }
        
        int count = 0;
        for (int i : student) if (i>0) count++;
        
        return count;
        
    }
}