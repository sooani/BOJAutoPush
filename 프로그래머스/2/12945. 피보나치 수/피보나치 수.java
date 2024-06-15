class Solution {
    public int solution(int n) {
        int[] num = new int[n+1];
        num[0] = 0;
        num[1] = 1;
        for(int i = 2; i <= n; i++){
            num[i] = (num[i-2] + num[i-1]) %1234567;
            }
        return num[n];
    }
}