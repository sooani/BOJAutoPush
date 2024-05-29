class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] counts = new int[31]; //문자열 최대길이
        
        for(String arr : strArr){
            int length = arr.length();
            counts[length]++;
        }
        
        for(int count : counts){
            answer = Math.max(answer, count);
        }
        return answer;
    }
}