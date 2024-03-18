class Solution {
    public int[] solution(int start, int end_num) {
        int[] list = new int[start - end_num + 1];
        for(int i = 0; i < list.length; i++){
            list[i] = start--;
        }
        return list;
    }
}