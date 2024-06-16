class Solution {
    public int[] solution(String s) {
        int t = 0; //이진변환횟수
        int z = 0; //0제거횟수
        while (!s.equals("1")) { //1이 될때까지 반복
            StringBuilder sb = new StringBuilder();

            for(char c : s.toCharArray()){
                if(c == '0'){
                    z++;
                }else {
                    sb.append(c);
                }
            }
            int one = sb.length(); //0 제거후 1만 남은 길이
            s = Integer.toBinaryString(one); //문자열 s 업데이트 
            //이진수로 변환후 문자열 반환 다음 반복에서 새로운 문자열 가리킴
            t++;
        }
        return new int[] {t, z};
    }
}