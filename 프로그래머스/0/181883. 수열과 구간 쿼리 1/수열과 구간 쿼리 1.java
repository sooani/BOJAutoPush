class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //arr[i]를 1씩 더하기 i는 s~e까지
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            for(int j = s; j <= e; j++) {
                arr[j] += 1;
            }
        }
        return arr;
    }
}