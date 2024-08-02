class Solution {
    public String solution(String rsp) {
        return rsp.replace("2", "바위").replace("0", "보").replace("5", "2").replace("바위", "0").replace("보", "5");
    }
}