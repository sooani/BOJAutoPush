import java.util.Arrays;

class Solution {
  public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String numList : list) {
            sb.append(numList);
        }
        return Long.parseLong(sb.reverse().toString());
  }
}