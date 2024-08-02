import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(String[] strArr) {
        return IntStream.range(1, 31).map(i -> (int) Arrays.stream(strArr).filter(n -> n.length() == i).count()).max().orElse(0);
    }
}