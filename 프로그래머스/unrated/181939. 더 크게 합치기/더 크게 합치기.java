
class Solution {
    public int solution(int a, int b) {

        String str = String.valueOf(a)+String.valueOf(b);
        //정수를 문자열로 변환해서 연결
        String str2 = String.valueOf(b)+String.valueOf(a);
        int result;

        if( Integer.parseInt(str) > Integer.parseInt(str2) ) {
            //문자열을 정수로 변환하여 비교
            result = Integer.parseInt(str);
         }else {
            result = Integer.parseInt(str2);
        }
        
        return result;

    }
}