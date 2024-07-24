
import java.io.FileInputStream;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        
        // 각 테스트 케이스 처리
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // 건물의 개수 입력 받기
            int[] heights = new int[N]; // 각 건물의 높이 배열
            
            // 각 건물의 높이 입력 받기
            for (int i = 0; i < N; i++) {
                heights[i] = sc.nextInt();
            }
            
            // 결과 계산을 위한 변수 초기화
            int home = 0;
            
            // 각 건물에 대해 비교하여 조건에 맞는 경우 home에 더하기
            for (int i = 2; i < N - 2; i++) {
                int maxAdjacent = Math.max(heights[i - 2], Math.max(heights[i - 1], Math.max(heights[i + 1], heights[i + 2])));
                if (heights[i] > maxAdjacent) {
                    home += heights[i] - maxAdjacent;
                }
            }
            
            // 결과 출력
            System.out.println("#" + test_case + " "+ home);
        }
        sc.close();
    }
}