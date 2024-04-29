import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        //true는 마지막에 arr[i]인덱스값을 2번 추가하고 false는 마지막에 arr[i]인덱스값 개수만큼 제거하기
        ArrayList<Integer> X = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (flag[i]) {
               for(int j = 0; j < (arr[i] * 2); j++) {
                 X.add(arr[i]);  
               }
            }else {
                for(int j = 0; j < arr[i]; j++){
                    X.remove(X.size() - 1);
                }
            }
        }
        return X.stream().mapToInt(Integer::intValue).toArray();
    }
}