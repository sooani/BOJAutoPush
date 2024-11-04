import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        // 첫번째 * 마지막 2N-1 나머지는 양쪽 끝 * 가운데공백
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            //공백
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            // 공백 + 별
            if (i == 1) { //첫줄
                System.out.println("*");
            } else if (i == N) { //마지막줄
                for (int j = 1; j <= 2 * N - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // 양끝 별, 중간 공백
                System.out.print("*"); // 첫 번째 별 출력
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" "); // 중간공백
                }
                System.out.println("*"); // 마지막 별
            }
            sc.close();
        }
    }
}