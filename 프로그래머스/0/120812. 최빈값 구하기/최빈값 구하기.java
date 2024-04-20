import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int answer = 0;
        
        for(int num : array) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            
            if(count > max) {
                max = count;
                answer = num;
            }else if (count == max) {
                answer = -1;
            }
        }
        return answer;
    }
}