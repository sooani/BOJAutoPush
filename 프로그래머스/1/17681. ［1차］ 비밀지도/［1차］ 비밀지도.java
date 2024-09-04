class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // n 길이인 정사각형 배열 arr1[i], arr2[i]를 이진수로 변환후 두 이진수를 겹쳐서 1의 개수만큼 #, 아니라면 공백으로 담긴 배열 출력
        String[] answer  = new String[n];
        for(int i = 0; i < n; i++){
            int num = arr1[i] | arr2[i];
            
            // 이진수 문자열로 변환하고 길이가 n이 되도록 앞을 0으로 채움
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i])).replace(' ', '0');
            
            StringBuilder line = new StringBuilder();
            
            for (char c : binaryString.toCharArray()) {
                if (c == '1') {
                    line.append("#");
                } else {
                    line.append(" ");
                }
            }
            answer[i] = line.toString();
        }
        return answer;
    }
}