class Solution {
    public int solution(int[] sides) {
        int answer = Math.min(sides[0], sides[1]);
        return answer + (answer - 1);
    }
}