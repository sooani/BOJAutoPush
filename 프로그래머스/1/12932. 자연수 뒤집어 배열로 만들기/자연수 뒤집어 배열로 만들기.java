class Solution {
    public int[] solution(long n) {
        StringBuilder str = new StringBuilder(String.valueOf(n)).reverse();
        int[] result = new int[str.length()];
        
        for(int i = 0; i < str.length(); i++){
            result[i] = Character.getNumericValue(str.charAt(i));
        }
        return result;
    }
}