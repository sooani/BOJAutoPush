class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sum = sides[0] + sides[1];
        int min = Math.min(sides[0],sides[1]);
        int max = Math.max(sides[0],sides[1]);
        
        for(int i = 1; i < sum; i++){
            if( i <= min || i < max ){
                if(max < min + i){
                    answer++; 
                }
            }else if( i >= max){
                answer++;
            }
        }
        return answer;
    }
}