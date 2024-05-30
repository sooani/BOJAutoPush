class Solution {
    boolean solution(String s) {
        int bc = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                bc++;
            }else if(ch == ')'){
                bc--;
                if(bc < 0 ){
                    return false;
                }
            }
        }
        return bc == 0;
    }
}