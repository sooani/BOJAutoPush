import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int x = n;
        while(x != 1) {
            arr.add(x);
            if(x % 2 == 0){
                x /= 2;
            }else {
               x = 3 * x + 1;
            }
        }
        arr.add(1);
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}