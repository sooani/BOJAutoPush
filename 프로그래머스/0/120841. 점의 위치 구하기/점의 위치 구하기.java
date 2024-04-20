class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int quadNum = (x >= 1 && y < 1) ? 4 : (x < 1 && y < 1) ? 3 : (x < 1 && y >= 1) ? 2 : 1;
        return quadNum;
    }
}