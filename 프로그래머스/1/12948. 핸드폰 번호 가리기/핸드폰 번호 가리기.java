class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String start = "*".repeat(length - 4);
        String end = phone_number.substring(length - 4);
        
        return start + end;
    }
}