class Solution {
    public int solution(String numStr) {
        return numStr.chars().map(c -> c - 48).sum();
    }
}