class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            int num = food[i] / 2;
            while(num != 0){
                sb.append(i);
                num--;
            }
        }
        String str = sb.toString();
        for(int i = str.length() -1; i >= 0; i--){
            sb2.append(str.charAt(i));
        }
        sb.append("0");
        sb.append(sb2);        
        
        return sb.toString();
    }
}