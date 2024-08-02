class Solution {
    public int solution(int order) {
        String s = "" + order;
        return s.replaceAll("[^369]", "").length();
    }
}