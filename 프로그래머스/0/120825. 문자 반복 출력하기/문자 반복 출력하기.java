class Solution {
    public String solution(String my_string, int n) {
        String[] str = my_string.split("");
        String result = "";
        
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < n; j++){
                result += str[i];
            }
        }
        return result;
    }
}