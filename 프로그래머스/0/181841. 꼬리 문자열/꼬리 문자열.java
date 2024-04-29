class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder result = new StringBuilder();
        for (String str : str_list) {
            result.append(!str.contains(ex) ? str : "");
        }
        return result.toString();
    }
}
