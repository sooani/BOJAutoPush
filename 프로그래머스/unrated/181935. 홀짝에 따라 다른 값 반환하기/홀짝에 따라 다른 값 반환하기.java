import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
       return IntStream.rangeClosed(1, n)
                .filter(num -> (n % 2 != 0) ? num % 2 != 0 : num % 2 == 0)
                .map(num -> (n % 2 != 0) ? num : num * num)
                .sum();
    }
}