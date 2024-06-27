class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        int answer = 0;
        for(int i = 0; i <= t.length()-len; i++){
            if(Long.parseLong(p) >= Long.parseLong(t.substring(i,i+len))){
                answer++;
            }
        }
        return answer;
    }
}