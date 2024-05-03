class Solution {
    public String solution(String my_string) {
        StringBuilder str = new StringBuilder();
        
        for(char ch : my_string.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                str.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)) {
                str.append(Character.toUpperCase(ch));
            }
        }
        return str.toString();
    }
}