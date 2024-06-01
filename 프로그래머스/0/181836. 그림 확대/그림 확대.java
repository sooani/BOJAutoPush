class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i = 0; i < picture.length; i++){
            StringBuilder arr = new StringBuilder();
            for(char c : picture[i].toCharArray()){
                for(int j = 0; j < k; j++){ //문자 k번 반복후 추가
                    arr.append(c);
                }
            }
            for(int j = 0; j < k; j++){//행을 배열에 k번 추가
                answer[i * k + j] = arr.toString();
            }
        }
        return answer;
    }
}