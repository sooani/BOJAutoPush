class Solution {
    public int solution(int[] numbers, int n) {
        int num = 0;
        for (int i = 0; i < numbers.length && (num += numbers[i]) <= n; i++);
        return num;
    }
}