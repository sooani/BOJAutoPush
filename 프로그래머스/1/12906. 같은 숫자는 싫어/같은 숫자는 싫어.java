import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                answer.add(arr[i]);
            }
        }
        answer.add(arr[arr.length-1]);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}