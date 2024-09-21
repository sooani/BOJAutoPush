class Solution {
    public int solution(int[] nums) {
        setPrimeArr();
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if (!prime[nums[i] + nums[j] + nums[k]]){ // 세 숫자합이 f면 소수
                        count++;
                    }
                }
            }
        }
        return count;
    }
    boolean[] prime = new boolean[3001]; // 0부터 3000까지 배열 f = 소수
    
    private void setPrimeArr(){ // 배수는 t
        for(int i = 2; i * i <= 3000; i++){
            for(int j = i; i * j <= 3000; j++){
                prime[i * j] = true;
            }
        }
    }
}