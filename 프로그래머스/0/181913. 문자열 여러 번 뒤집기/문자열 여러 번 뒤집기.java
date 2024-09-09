class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int[] query : queries){ // 인덱스 가져옴
            int start = query[0];
            int end = query[1];
            
            // 서브 문자열 만들어서 뒤집기
            StringBuilder s = new StringBuilder(sb.substring(start, end + 1));
            s.reverse();
            
            sb.replace(start, end + 1, s.toString());
        }
        return sb.toString();
    }
}