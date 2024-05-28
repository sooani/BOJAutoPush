class Solution {
    public int[] solution(int[] arr) {
        int num1 = 0;
        int num2 = 0;
        int o = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                num1 = i;
                break;
            }
        }
        for(int i = arr.length -1; i >= 0; i--){
            if(arr[i] == 2){
                num2 = i;
                break;
            }
        }
        int[] answer = new int[num2 - num1 +1];
        
        if(num1 == 0 && num2 == 0){
            answer[0] = -1;
        }else{
            for(int i = num1; i <= num2; i++){
                answer[o++] = arr[i];
            }
        }
        return answer;
    }
}