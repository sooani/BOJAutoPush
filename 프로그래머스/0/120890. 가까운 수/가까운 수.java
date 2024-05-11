class Solution {
    public int solution(int[] array, int n) {
        int k = Math.abs(array[0] - n);
        int answer = array[0];
        
        for(int i = 1; i < array.length; i++){
            int min = Math.abs(array[i] - n);
            if(min < k || min == k && array[i] < answer){
                k = min;
                answer = array[i];
            }
        }
        return answer;
    }
}