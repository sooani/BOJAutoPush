import java.util.Arrays;
class Solution { 
    public int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        int[] answer = new int[length];

        for(int i = 0; i < length; i++){
            int[] arr = new int[commands[i][1] - commands[i][0]+1];
            int count = 0;
            
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                arr[count++] = array[j];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}