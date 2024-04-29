class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder reversedSubstring = new StringBuilder(sb.substring(s, e + 1)).reverse();
        return sb.replace(s, e + 1, reversedSubstring.toString()).toString();
    }
}
