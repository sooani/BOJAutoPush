import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String str = Integer.toString(i);
            boolean valid = true;
            
            for(char ch : str.toCharArray()){
                if(ch != '5' && ch != '0'){
                    valid = false;
                    break;
                }
            }
            if(valid){
                result.add(i);
            }
            
        }
        if(result.isEmpty()) {
            return new int[]{-1};
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}