class Solution {
    public int solution(int price) {
        return price >= 100000 && price < 300000 ? (int)((double)price-(price*0.05)) : price >= 300000 && price < 500000 ? (int)((double)price-(price*0.1)) : price >= 500000 ? (int)((double)price-(int)(price*0.2)) : price;
    }
}