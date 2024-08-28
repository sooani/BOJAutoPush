import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> resultSet = new TreeSet<>(); // 중복허용 x, 결과 오름차순 정렬
        int n = numbers.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[resultSet.size()];
        for (int num : resultSet) {
            answer[index++] = num;
        }
        return answer;
    }
}