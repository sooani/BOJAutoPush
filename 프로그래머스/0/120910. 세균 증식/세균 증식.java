class Solution {
    public int solution(int n, int t) {
        int num = n;
        for(int i = 1; i <= t; i++) { 
                num *= 2;
        }
        return num;
    }
}