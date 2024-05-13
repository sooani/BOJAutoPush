import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        String spellStr = String.join("", spell);
        
        for (String word : dic) {
            boolean containsAllChars = true;
            for (char c : spellStr.toCharArray()) {
                if (word.indexOf(c) == -1) {
                    containsAllChars = false;
                    break;
                }
            }
            if (containsAllChars) {
                return 1;
            }
        }
        
        return 2;
    }
}
