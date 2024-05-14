import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 2;
        while(i <= n){
            if(n % i == 0){
                arr.add(i);
                n /= i;
            }else{
                i++;
            }
        } 
        return arr.stream().distinct().mapToInt(Integer::intValue).toArray();
    }
}