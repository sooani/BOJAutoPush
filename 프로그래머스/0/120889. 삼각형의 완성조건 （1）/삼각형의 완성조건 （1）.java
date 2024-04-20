class Solution {
    public int solution(int[] sides) {
         return (sides[0] < sides[1] + sides[2] && sides[1] < sides[0] + sides[2] && sides[2] < sides[0] + sides[1]) ? 1 : 2;
    }
}