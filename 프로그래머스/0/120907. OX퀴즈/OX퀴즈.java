class Solution {
    public String[] solution(String[] quiz) {
        String[] results = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] str = quiz[i].split(" ");
            String op = str[1];
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[2]);
            int z = Integer.parseInt(str[4]);
            int result = 0;
            
            if(str[1].equals("+")){
                result = x + y;
            }else if(str[1].equals("-")){
                result = x - y;
            }
            results[i] = result == z ? "O" : "X";
        }
        return results;
    }
}