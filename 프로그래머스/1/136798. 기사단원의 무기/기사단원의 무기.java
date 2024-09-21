import java.util.ArrayList;

class Solution {
    public int solution(int number, int limit, int power) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int result = 0;
        
        for (int i = 0; i <= number; i++) {
            arrayList.add(0); // 처음엔 다 0
        }
        
        // 각 수의 약수 개수 계산
        for(int i = 1; i <= number; i++){
            for(int j = i; j <= number; j += i){
                // i의 배수들에 대해 약수 개수를 1씩 증가
                arrayList.set(j, arrayList.get(j)+1);
                }
        }
        
        // limit을 넘는 값을 power로 변경하고, sum 계산
        for(int i = 1; i <= number; i++){
            int count = arrayList.get(i); // 각 숫자의 약수의 개수 가져오기
            if(count > limit){
                result += power;
                }else{
                result += count;
            }
        }
        return result;
    }
}