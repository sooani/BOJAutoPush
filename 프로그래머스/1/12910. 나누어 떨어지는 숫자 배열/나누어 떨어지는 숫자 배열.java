import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                num.add(arr[i]);
            }
        }
        if(num.isEmpty()){
            return new int[]{-1};
        }
        
        Collections.sort(num);
        return num.stream().mapToInt(Integer::intValue).toArray();
    }
}