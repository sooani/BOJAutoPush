class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNumbers = new StringBuilder();
        StringBuilder evenNumbers = new StringBuilder();
        
        for(int num : num_list) {
            if(num % 2 == 1) {
                oddNumbers.append(num);
            } else {
                evenNumbers.append(num);
            }
        }
        return Integer.parseInt(oddNumbers.toString())+Integer.parseInt(evenNumbers.toString());
    }
}