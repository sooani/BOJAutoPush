class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(a <= n){
            int newSum = n / a * b;
            int bottle = n % a;
            answer += newSum;
            n = newSum + bottle;
        }
        return answer;
    }
}