import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> answerList = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                for(int j = 0; j < i; j++){
                   answerList.add(str_list[j]); 
                }
                return answerList.toArray(new String[0]);//리스트를 배열로
            }else if(str_list[i].equals("r")){
                for(int j = i+1; j < str_list.length; j++){
                    answerList.add(str_list[j]);
                }
                return answerList.toArray(new String[0]);
            }
        }
        return new String[0];
    }
}