class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int l = arr.length;
        int answer = Integer.parseInt(arr[0]);
        for(int i = 1; i < l; i += 2){
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i+1]);
            }else{
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        return answer;
    }
}