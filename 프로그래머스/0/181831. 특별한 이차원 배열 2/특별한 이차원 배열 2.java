class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
               return arr[i][j] == arr[j][i] ? 1 : 0;
            }
        }
        return 1;
    }
}