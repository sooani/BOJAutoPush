class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirstChar = true;
        
        for(char ch : s.toCharArray()){
            //공백문자일경우 공백 그대로 추가
            if(Character.isWhitespace(ch)) {
                isFirstChar = true;
                answer.append(ch);
            }else{
                if(isFirstChar){
                    //첫글자면 대문자로변환
                    answer.append(Character.toUpperCase(ch));
                    isFirstChar = false;
                }else{
                    //나머지는 모두 소문자
                    answer.append(Character.toLowerCase(ch));
                }
            }
        }
        return answer.toString();
    }
}