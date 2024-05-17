class Solution {
    public int solution(int[] common) {
        int num = 0;
        if(common[2] - common[1] == common[1] - common[0]) {
            num = common[2] - common[1];
            return common[common.length -1] + num;
        } else{
            num = common[2] / common[1];
        }
        return common[common.length -1] * num;
    }
}