class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int max = Integer.parseInt(answer[0]);
        int min = Integer.parseInt(answer[0]);
        
        for(String num : answer){
            int strNum = Integer.parseInt(num);
            if(strNum < min){
                min = strNum;
            }
            if(strNum > max){
                max = strNum;
            }
        }
        return min + " " + max;
    }
}