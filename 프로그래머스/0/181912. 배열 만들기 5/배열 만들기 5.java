import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        // k보다 큰 값, s번 인덱스부터 시작해서 l길이만큼의 문자열을 정수로
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(String num : intStrs) {
            int num2 = Integer.parseInt(num.substring(s, s + l));
            if(num2 > k){
                arr.add(num2);
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}