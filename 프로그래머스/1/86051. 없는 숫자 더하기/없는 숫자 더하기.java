import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 45;
        
        for(int number : numbers){
            answer += number;
        }
        return sum - answer;
    }
}