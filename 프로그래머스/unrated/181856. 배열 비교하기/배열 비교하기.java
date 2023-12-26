import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum = Integer.compare(Arrays.stream(arr1).sum(), Arrays.stream(arr2).sum());
        return arr1.length == arr2.length ? Integer.signum(sum) : Integer.compare(arr1.length, arr2.length);
    }
}
