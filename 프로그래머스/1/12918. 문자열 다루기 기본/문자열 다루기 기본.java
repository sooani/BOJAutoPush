class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            for(char ch : s.toCharArray()){
                if(!Character.isDigit(ch)){
                    answer = false;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
}