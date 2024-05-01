import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        return Arrays.stream(arr)
            .filter(i -> !i.isEmpty())
            .toArray(String[]::new);
    }
}