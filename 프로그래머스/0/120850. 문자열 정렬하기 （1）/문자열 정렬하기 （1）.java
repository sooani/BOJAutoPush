class Solution {
    public int[] solution(String my_string) {
        int[] result = my_string.chars()
            .filter(Character::isDigit)
            .map(Character::getNumericValue)
            .sorted()
            .toArray();
        
        return result;
    }
}