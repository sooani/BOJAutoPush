class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder str = new StringBuilder(my_string);
        
        char tmp = str.charAt(num1);
        str.setCharAt(num1, str.charAt(num2));
        str.setCharAt(num2, tmp);
        
        return str.toString();
    }
}