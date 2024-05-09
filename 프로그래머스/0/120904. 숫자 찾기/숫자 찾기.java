class Solution {
    public int solution(int num, int k) {
        String arr = Integer.toString(num);
        for(int i = 0; i < arr.length(); i++){
            char digit = arr.charAt(i);
            if(digit - 48 == k){
                return i + 1;
            }
        }
        return -1;
    }
}