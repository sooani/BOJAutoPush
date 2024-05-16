class Solution {
    public int solution(int chicken) {
        int sv = 0;
        int cp = chicken;
        
        while(cp >= 10){
            int count = cp / 10;
            sv += count;
            
            cp %= 10;
            cp += count;
        }
        return sv;
    }
}