class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < goal.length; i++) {
            // goal의 요소가 cards1 배열의 요소와 일치하는지 확인
            if (index1 < cards1.length && goal[i].equals(cards1[index1])) {
                index1++;  // cards1 배열에서 다음 요소로 이동
            }
            else if (index2 < cards2.length && goal[i].equals(cards2[index2])) {
                index2++;
            } 
            else {
                return "No";
            }
        }
        return "Yes";
    }
}