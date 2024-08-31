class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow; // 총 격자 수
        int[] answer = new int[2]; // 결과 저장 배열
        
        // 약수 쌍을 찾기 위해 반복
        for(int i = 3; i <= Math.sqrt(total); i++){
            if(total % i == 0){
                int height = total / i;
                
                // 가로와 세로가 3 이상인 경우만
                if(i >= 3 && height >= 3){
                    // 내부 크기 yellow와 일치하는지 확인
                    if((i-2) * (height-2) == yellow) {
                        answer[0] = height;
                        answer[1] = i;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}