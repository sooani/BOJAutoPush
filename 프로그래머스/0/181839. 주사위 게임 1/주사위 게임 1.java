class Solution {
    public int solution(int a, int b) {
        int num = 0;
        if(a % 2 == 1 && b % 2 == 1) {
            num = a * a + b * b;
        }else if(a % 2 == 0 && b % 2 == 0) {
            num = Math.abs(a - b);
        }else {
            num = 2 * (a + b);
        }
        return num;
    }
}