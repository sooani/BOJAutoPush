class Solution {
    public int solution(int a, int b) {
        String str = Integer.toString(a)+Integer.toString(b);
        int result1 = Integer.parseInt(str);
        int result2 = 2*a*b;
        
        if( result1 >= result2 ){
            
            return result1;
            
        }else {
            
            return result2;
        }
    }
}