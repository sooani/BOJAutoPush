class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        // 배열의 나머지 요소들에 대해 최소공배수를 반복적으로 계산
        for (int i = 1; i < arr.length; i++) {
            // 최대공약수(GCD)를 구함
            int a = answer;
            int b = arr[i];
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int gcd = a;
            
            // 최소공배수(LCM)를 구함
            answer = (answer * arr[i]) / gcd;
        }

        return answer;
    }
}