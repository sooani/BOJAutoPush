class Solution {
    public int solution(int[] num_list) {
        //짝수는 반 나누기 홀수는 -1 후 반 나누고 마지막이 1될때까지
        int count = 0;
        for(int num : num_list) {
            while(num != 1) {
                num = num % 2 == 0 ? num / 2 : (num - 1) / 2;
                    count++;
            }
        }
        return count;
    }
}