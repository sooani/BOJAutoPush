class Solution {
    public int solution(int n) { // 1부터 n까지 소수의 개수
        boolean[] isPrime = new boolean[n+1]; // 소수여부 저장배열
        for(int i = 2; i <= n; i++){
            isPrime[i] = true; // 모두 소수라고 가정
        }
        
        for(int i = 2; i * i <= n; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j+=i){
                    isPrime[j] = false; // i의 배수는 false로 설정
                }
            }
        }
        int answer = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                answer++;
            }
        }
        return answer;
    }
}