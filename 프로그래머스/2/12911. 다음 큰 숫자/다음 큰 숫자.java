class Solution {
    public int solution(int n) {
        //n의 이진수의 1갯수와 n보다 큰 자연수의 이진수 1갯수가 같음
        int count = Integer.bitCount(n);
        int num = n + 1;
        while(true){
            if(Integer.bitCount(num) == count){
                return num;
            }
            num++;
        }
    }
}