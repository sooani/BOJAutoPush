class Solution {
    public String[] solution(String my_str, int n) {
        String str = "(?<=\\G.{" + n + "})";
        String[] answer = my_str.split(str);
        return answer;
    }
}