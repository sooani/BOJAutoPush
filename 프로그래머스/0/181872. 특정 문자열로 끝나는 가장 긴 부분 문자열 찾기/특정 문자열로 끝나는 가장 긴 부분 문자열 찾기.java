class Solution {
    public String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat); //오른쪽부터 검색해서 마지막 위치
        String answer = myString.substring(0, idx + pat.length());
        return answer;
    }
}