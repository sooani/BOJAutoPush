class Solution {
    public int solution(int[][] sizes) {
        int maxNum1 = Integer.MIN_VALUE;
        int maxNum2 = Integer.MIN_VALUE;
        
        for(int i = 0; i < sizes.length; i++){
            int maxSize = Math.max(sizes[i][0], sizes[i][1]);
            int minSize = Math.min(sizes[i][0], sizes[i][1]);
            
            if(maxNum1 < maxSize){
                maxNum1 = maxSize;
            }            
            if(maxNum2 < minSize){
                maxNum2 = minSize;
            }
        }       
        return maxNum1*maxNum2;
    }
}