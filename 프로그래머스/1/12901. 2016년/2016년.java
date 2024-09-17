class Solution {
    public String solution(int a, int b) {
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] weeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int fri = 5;
        int totalDays = 0;
        
        for(int i = 0; i < a - 1; i++){
            totalDays += month[i];
        }
        totalDays += b;
        
        int day = (fri + (totalDays - 1)) % 7;
        String answer = weeks[day];
        return answer;
    }
}