class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] words = s.split("");
        
        for(String word : words){
            idx = word.contains(" ") ? 0 : idx + 1;
            answer += idx % 2 == 0 ? word.toLowerCase() : word.toUpperCase();
        }
        return answer;
    }
}