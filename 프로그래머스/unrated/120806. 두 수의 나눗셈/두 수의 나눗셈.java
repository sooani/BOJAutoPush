class Solution {
    public double solution(double num1, double num2) {
         double avr;
        
        avr = ( num1 / num2 );
        int answer = (int)(avr * 1000);
        
        return answer;
    }
}