import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                arr.add(strArr[i]);
            }
        }
        return arr.toArray(new String[0]);
    }
}