class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        
        for(int i = 0; i < myString.length(); i++) {
             if(myString.substring(i).startsWith(pat)){
                 count++;
             }
        }
        return count;
    }
}