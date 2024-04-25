class Solution {
    public int solution(int[] num_list) {
        int num1 = 0;
        int num2 = 1;
        for(int i = 0; i < num_list.length; i++) {
            num1 += num_list[i];
            num2 *= num_list[i];
        }
        return num2 < (num1 * num1) ? 1 : 0;
    }
}