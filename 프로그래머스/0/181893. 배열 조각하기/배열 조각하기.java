import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            int q = query[i];
            
            if (i % 2 == 0) {
                // 짝수 인덱스일 때: arr를 0부터 query[idx]까지 자르기
                arr = Arrays.copyOfRange(arr, 0, q + 1);
            } else {
                // 홀수 인덱스일 때: arr를 query[idx]부터 끝까지 자르기
                arr = Arrays.copyOfRange(arr, q, arr.length);
            }
        }
        return arr;
    }
}