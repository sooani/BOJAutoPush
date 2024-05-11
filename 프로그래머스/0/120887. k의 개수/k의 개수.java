class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i; num<= j; num++){
            StringBuilder sb = new StringBuilder();
            sb.append(num);
            int length = sb.length();
            
            for(int ch = 0; ch < length; ch++){
                if(sb.charAt(ch) - '0' == k){
                    answer++;
                }
            }
        }
        return answer;
    }
}