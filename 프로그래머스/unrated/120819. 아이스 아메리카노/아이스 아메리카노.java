class Solution {
    public int[] solution(int money) {
        int priceAmericano = 5500;
        int numberOfAmericano = money / priceAmericano;
        int remainingMoney = money % priceAmericano;
        
        int[] answer = {numberOfAmericano,remainingMoney};
        return answer;
    }
}