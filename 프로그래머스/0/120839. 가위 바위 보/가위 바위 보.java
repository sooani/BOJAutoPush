class Solution {
    public String solution(String rsp) {
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < rsp.length(); i++){
            char c = rsp.charAt(i);
           str.append(c == '2' ? '0' : c == '0' ? '5' : '2');
        }
        return str.toString();
    }
}