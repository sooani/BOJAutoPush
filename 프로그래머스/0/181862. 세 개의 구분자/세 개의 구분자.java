import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] words = myStr.split("(a|b|c)+");
        ArrayList<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result.add(word);
            }
        }
        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        return result.toArray(new String[result.size()]);
    }
}
