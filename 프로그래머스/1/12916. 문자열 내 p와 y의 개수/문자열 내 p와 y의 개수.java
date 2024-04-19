class Solution {
    boolean solution(String s) {
        int pCount = s.toLowerCase().replaceAll("[^p]", "").length();
        int yCount = s.toLowerCase().replaceAll("[^y]", "").length();
        
        return pCount == yCount;
    }
}