import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();
        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];
        
        for (int num : num_list) {
            arr.add(num);
        }
        
        arr.add(last > beforeLast ? last - beforeLast : last * 2);
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}