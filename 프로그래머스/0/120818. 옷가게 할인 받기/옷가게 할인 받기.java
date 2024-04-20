class Solution {
    public int solution(int price) {
        int discountRate = price >= 500000 ? 20 : price >= 300000 ? 10 : price >= 100000 ? 5 : 0;
        return price * (100 - discountRate) / 100;
    }
}