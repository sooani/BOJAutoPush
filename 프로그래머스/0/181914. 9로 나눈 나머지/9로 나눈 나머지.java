class Solution {
    public int solution(String number) {
        String[] arr = number.split("");
        int num = 0;
        
        for(int i = 0; i < arr.length; i++) {
            num += Integer.parseInt(arr[i]);
        }
        return num % 9;
    }
}