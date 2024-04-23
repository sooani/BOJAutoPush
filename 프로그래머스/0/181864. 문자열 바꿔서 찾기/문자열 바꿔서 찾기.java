class Solution {
    public int solution(String myString, String pat) {
        return myString.replace("A","ex").replace("B","A").replace("ex","B").contains(pat) ? 1 : 0;
    }
}