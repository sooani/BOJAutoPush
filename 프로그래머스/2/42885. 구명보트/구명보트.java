import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int left = 0; // 가장 가벼운 사람
        int right = people.length - 1; // 가장 무거운 사람
        int answer = 0;
        
        while(left <= right){
            if(people[left] + people[right] <= limit){ 
                // 두사람이 함께 탈 수 있다면 가벼운 사람 인덱스 증가
                left++;
            }
            right--;
            answer++;
        }
        return answer;
    }
}