class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        
        // 이중 반복문을 사용하여 i + j <= k 조건을 만족하는 요소들의 합을 구함
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    sum += board[i][j];
                }
            }
        }
        
        return sum;
    }
}
