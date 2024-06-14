class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                answer[ch[i] - 'a'+26]++; //26번인덱스 이후 소문자
            }else if(ch[i] >= 'A' && ch[i] <= 'Z'){
                answer[ch[i] - 'A']++;
            }
        }
        return answer;
    }
}