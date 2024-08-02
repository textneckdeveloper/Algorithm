class Solution {
    public int solution(String my_string) {
        return my_string.replaceAll("[^1-9]", "").chars().map(c -> c - '0').sum();
    }
}