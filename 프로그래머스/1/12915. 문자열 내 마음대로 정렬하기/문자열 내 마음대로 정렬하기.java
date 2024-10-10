import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            int check = Character.compare(s1.charAt(n), s2.charAt(n));
            return (check != 0) ? check : s1.compareTo(s2);
        }); return strings;
    }
}