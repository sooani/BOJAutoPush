class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] arr = my_string.toCharArray(); //my_string을 문자배열로 변환후 저장
        char[] overArr = overwrite_string.toCharArray(); //overwrite_string을 문자배열로 변환해서 저장
        int j = 0;//덮어 쓸 문자의 인덱스
        for(int i = s; i<(s+overwrite_string.length()); i++,j++) { //s(시작점)+길이 = 종료위치
            arr[i] = overArr[j]; //현재 인덱스 i의 위치에 새로운 문자열을 덮어쓰기한다
            // j를 사용해 새로운 문자열을 가져와 하나씩 증가
        }
        my_string = new String(arr); // 덮어쓴 결과를 다시 문자열로 변환해서 저장
        return my_string;
    }
}