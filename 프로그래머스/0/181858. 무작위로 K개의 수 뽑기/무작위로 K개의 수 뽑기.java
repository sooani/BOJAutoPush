import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int[] answer = new  int[k];
        int j = 0; // 중복되지 않은 요소 인덱스
        
        // arr 배열을 순회하면서 고유한 요소를 answer 배열에 채움
        for(int i = 0; i < arr.length; i++){
            if (!set.contains(arr[i])) {
                set.add(arr[i]); //set에 중복되지 않는 요소 추가
                answer[j] = arr[i];
                //answer에 중복되지 않는 요소 추가
                j++; //answer 배열 인덱스 증가
            }
            if(j == k){
                break; //k개의 요소 찾으면 종료
            }
        }        
        for(int i = j; i < k; i++){
            answer[i] = -1;
        }
        
        return answer;
    }
}
