import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] e = new int[n *2];
        
        for(int i = 0; i < n; i++){ // 배열 두번
            e[i] = elements[i];
            e[i+n] = elements[i];
        }
        
        Set<Integer> sumEle = new HashSet<>();
        
        for(int i = 0; i < n; i++){ // i는 시작위치, j는 부분수열의 길이
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += e[i+j]; // 부분수열의 합
                sumEle.add(sum); // 집합에 추가, 중복제거
            }
        }
        
        return sumEle.size();
    }
}