class Solution {
    public int solution(String num_str) {
        int result = 0;
        for(int i = 0; i < num_str.length(); i++) {
            result += (int)(num_str.charAt(i)-'0');
        }
        return result;
    }
}