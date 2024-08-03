class Solution {
    public String solution(String phone_number) {
        
        String front = phone_number.substring(0, phone_number.length()-4);
        String back = phone_number.substring(phone_number.length()-4, phone_number.length());
        
        return front.replaceAll("[0-9]", "*") + back;
        
    }
}