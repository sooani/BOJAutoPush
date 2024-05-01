class Solution {
    public String solution(int q, int r, String code) {
        //code의 인덱스를 q로 나눠서 나머지가 r인 요소를 이어붙인 문자열 반환
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++) {
            if(i % q == r) {
                str.append(code.charAt(i));
            }
        }
        return str.toString();
    }
}