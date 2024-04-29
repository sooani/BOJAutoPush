class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder arr = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            boolean exclude = false;
            for(int num : indices) {
                if(i == num){
                    exclude = true; //인덱스가 배열에 있으면 제외
                    break;
                }
            }
            if(!exclude) {
                arr.append(my_string.charAt(i));
            }
        }
        return arr.toString();
    }
}