import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = new String[my_string.length()];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = my_string.substring(i, my_string.length());
        }
        
        Arrays.sort(arr);
        
        return arr;
    }
}