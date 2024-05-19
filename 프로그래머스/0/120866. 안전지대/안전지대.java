import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int danger = 0;
        int total = board.length * board.length;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    danger++;

                    for (int p = i - 1; p <= i + 1; p++) {
                        for (int q = j - 1; q <= j + 1; q++) {
                            if (p >= 0 && q >= 0 && p < board.length && q < board.length) {
                                if (board[p][q] != 2 && board[p][q] != 1) {
                                    board[p][q] = 2;
                                    danger++;
                                }
                            }
                        }
                    }
                }
            }
        }

        answer = total - danger;

        return answer;
    }
}