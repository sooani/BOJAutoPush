class Solution {
    public int[] solution(int[] arr) {
        int arrLength = 0;
        int index = 0; 
        for(int num : arr) {
            arrLength += num;
        }
        int[] result = new int[arrLength]; 
        for(int i = 0; i < arr.length; i++) { 
            for(int j = 0; j < arr[i]; j++) {
                result[index++] = arr[i];
            }
        }
        return result;
    }
}