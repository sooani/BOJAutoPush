import java.util.*;

public class Solution {
    public int solution(int n) {
        int b = 0;
        while(n > 0){ // 0이 될때까지 반복
            if(n % 2 == 1){ // 홀수일때 점프
                b++;
                n--; // 현재위치 -1
            }
            n /= 2; // 짝수일때 순간이동
        }
        return b;
    }
}