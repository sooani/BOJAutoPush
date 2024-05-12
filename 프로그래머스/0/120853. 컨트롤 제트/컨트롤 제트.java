class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        int prNum = 0;
        
        for(String num : arr) {
             if(num.equals("Z")){
                 answer -= prNum;
             }else {
                 answer += Integer.parseInt(num);
                 prNum = Integer.parseInt(num);
             }
        }
        return answer;
    }
}