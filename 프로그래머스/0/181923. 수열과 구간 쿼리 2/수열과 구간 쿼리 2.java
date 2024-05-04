class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0]; //시작
            int e = queries[i][1]; //끝
            int k = queries[i][2]; //최소값
            int min = 1000000;
            
            for(int j = s; j <= e; j++) {
                if(k < arr[j] && arr[j] < min) {
                   min = arr[j];
                }
            }
            if(min == 1000000) {
                min = -1;
            }result[i] = min;
        }
        return result;
    }
}