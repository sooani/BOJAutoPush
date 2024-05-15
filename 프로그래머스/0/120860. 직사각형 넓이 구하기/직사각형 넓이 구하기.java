class Solution {
    public int solution(int[][] dots) {
        int xMax = -255;
        int xMin = 255;
        int yMax = -255;
        int yMin = 255;
        
        for(int[] point : dots){
            xMax = Math.max(xMax,point[0]);
            xMin = Math.min(xMin,point[0]);
            yMax = Math.max(yMax,point[1]);
            yMin = Math.min(yMin,point[1]);
        }
        int xl = xMax - xMin;
        int yl = yMax - yMin;
        return xl*yl;
    }
}