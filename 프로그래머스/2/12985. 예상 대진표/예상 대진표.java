class Solution {
    public int solution(int n, int a, int b) {
        int round = 0;

        while (a != b) {
            // 각 참가자의 번호를 갱신
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;  // 라운드를 증가
        }
        return round;
    }
}