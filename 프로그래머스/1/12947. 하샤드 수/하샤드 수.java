class Solution {
    public boolean solution(int x) {
        int n = x;
        int num = 0;
        while(x > 0){
            num += x % 10;
            x = x / 10;
        }
        return n % num == 0;
    }
}