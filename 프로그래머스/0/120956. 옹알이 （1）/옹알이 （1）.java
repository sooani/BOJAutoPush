class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        String[] str = {"aya","ye","woo","ma"};
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < str.length; j++){
                babbling[i] = babbling[i].replace(str[j], " ");
                }
            if(babbling[i].trim().equals("")){
                count++;
            }
        }
        return count;
    }
}