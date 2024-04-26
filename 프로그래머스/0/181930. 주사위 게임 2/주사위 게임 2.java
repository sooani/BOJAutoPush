class Solution {
    public int solution(int a, int b, int c) {
        int num1 = 0;

        if(a == b && b == c) {
            num1 = (a + b + c) * (a * a + b * b + c * c) * ((a * a * a) + (b * b * b) + (c * c * c));
        }else if(a != b && b != c && a != c) {
            num1 = a + b + c;
        }else {
            num1 = (a + b + c) * (a * a + b * b + c * c);
        }
        return num1;
    }
}