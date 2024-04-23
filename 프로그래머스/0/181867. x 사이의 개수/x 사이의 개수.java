class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", -1);
        int[] lengths = new int[str.length];

        for(int i = 0; i < str.length; i++) {      
            lengths[i] = str[i].length();
        }
        return lengths;
    }
}