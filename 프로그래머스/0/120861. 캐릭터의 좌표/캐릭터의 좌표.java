class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int xl = board[0] / 2;
        int yl = board[1] / 2;

        for (String input : keyinput) {
            if (input.equals("left")) {
                if (answer[0] > -xl) {
                    answer[0] -= 1;
                }
            } else if (input.equals("right")) {
                if (answer[0] < xl) {
                    answer[0] += 1;
                }
            } else if (input.equals("up")) {
                if (answer[1] < yl) {
                    answer[1] += 1;
                }
            } else if (input.equals("down")) {
                if (answer[1] > -yl) {
                    answer[1] -= 1;
                }
            }
        }

        return answer;
    }
}
