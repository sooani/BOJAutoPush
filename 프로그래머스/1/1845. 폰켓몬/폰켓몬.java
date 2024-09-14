import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> uniqueNum = new HashSet<>();
        
        for(int num : nums){
            uniqueNum.add(num);
        }
        if(nums.length / 2 > uniqueNum.size()){
            return uniqueNum.size();
        }
        else{
            return nums.length / 2;
        }
    }
}