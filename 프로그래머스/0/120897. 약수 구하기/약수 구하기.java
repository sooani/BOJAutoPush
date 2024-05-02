import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> num = new ArrayList<>();
        
        for( int i = 1; i <= n / 2; i++) {
            if(n % i == 0){
            num.add(i);
                }
        }
        num.add(n);
        return num.stream().mapToInt(Integer::intValue).toArray();
    }
}