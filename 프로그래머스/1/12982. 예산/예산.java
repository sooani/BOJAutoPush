import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int num = 0;
        int count = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            if(num + d[i] <= budget){
                num += d[i];
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}