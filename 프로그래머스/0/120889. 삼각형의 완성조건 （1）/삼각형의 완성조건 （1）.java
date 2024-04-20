class Solution {
    public int solution(int[] sides) {
        int x = sides[0];
        int y = sides[1];
        int z = sides[2];
        return (x < y + z && y < x + z && z < x + y) ? 1 : 2;
    }
}