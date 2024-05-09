class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            String str = String.valueOf(my_string.charAt(i)); //문자를 문자열로 연결
            if(!answer.contains(str)){
                answer += str;
            }
        }
        return answer;
    }
}