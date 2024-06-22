import java.util.Stack;

class Solution{
    public int solution(String s){
        Stack<String> st = new Stack<>();
        String[] str = s.split("");
        
        for(String ss : str){
            if(!st.isEmpty() && st.peek().equals(ss)){
                st.pop();
            }else{
                st.push(ss);
            }
        }       

        return st.empty() ? 1 : 0;
    }
}