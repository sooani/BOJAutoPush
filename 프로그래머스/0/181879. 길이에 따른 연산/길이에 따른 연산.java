class Solution {
    public int solution(int[] num_list) {
        int num = 0;
        if(num_list.length >= 11 && num_list.length <= 20) {
            for(int i = 0; i < num_list.length; i++) {
                num += num_list[i];
            }
        }else if(num_list.length <= 10 && num_list.length >= 2) {
            num = 1;
            for(int i = 0; i < num_list.length; i++) {
                num *= num_list[i];
            }
        }
        return num;
    }
}