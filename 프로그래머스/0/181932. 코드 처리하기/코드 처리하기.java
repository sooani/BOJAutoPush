class Solution {
    public String solution(String code) {
        int mode = 0;
        String answer = "";
        String arr[] = code.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(mode == 0) {
                if(!arr[i].equals("1") && i % 2 == 0) {
                    answer += arr[i];
                }else if(arr[i].equals("1")) {
                    mode = 1;
                }
            }else{
                if(!arr[i].equals("1") && i % 2 != 0) {
                    answer += arr[i];
                }else if(arr[i].equals("1")) {
                    mode = 0;
                }
            }
        }
        if(answer.length() == 0){
            return "EMPTY";
        }
        return answer;
    }
}