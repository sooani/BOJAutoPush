class Solution {
    public long solution(int n) {
        int a = 1;
        int b = 2;
        
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }
        
        for(int i = 3; i <= n; i++){
            int next = (a + b) % 1234567;
            a = b;
            b = next;
        }
        
        return b;
    }
}