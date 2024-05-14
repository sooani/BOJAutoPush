class Solution {
    public int solution(int balls, int share) {
        long answer = solution2(balls, share);
        return (int) answer;
    }
        
    public long solution2(int n, int m) {
        if(n == m || m  == 0){
            return 1;
        }else {
        return solution2((n - 1), (m - 1)) + solution2(n - 1 , m);
        }
    }
}