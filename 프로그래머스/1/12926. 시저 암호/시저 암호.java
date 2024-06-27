class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)){
                char shifted = (char) (((c -'A' +n) % 26) +'A');
                //0기반 인덱스 구하고 이동할 인덱스 +n 구하고 알파벳
                //범위 내에서 순환하게 26으로 나머지를 구하고 다시 문자변환
                result.append(shifted);
            }else if(Character.isLowerCase(c)) {
                char shifted = (char) (((c -'a' +n) % 26) +'a');
                result.append(shifted);
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }
}