class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i <= my_string.length(); i += m){
            int end = Math.min(i + m , my_string.length());
            String sub = my_string.substring(i, end);
            
            if(sub.length() >= c){
                answer.append(sub.charAt(c-1));
            }
        }
        return answer.toString();
    }
}