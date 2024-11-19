import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] sizes = new int[6];

        for (int i = 0; i < 6; i++) {
            sizes[i] = sc.nextInt();
        }

        int T = sc.nextInt(); // 티셔츠 묶음
        int P = sc.nextInt(); // 펜 묶음

        int result = 0; // 최소 티셔츠
        int result2 = 0; // 펜 P자루씩 묶음 최대 주문
        int result3 = 0; // 남은 펜 한자루씩 주문

        for (int size : sizes) {
            result += (size + T - 1) / T;
        }
        result2 = N / P;
        result3 = N % P;
        if (N == sizes[0] + sizes[1] + sizes[2] + sizes[3] + sizes[4] + sizes[5]) {
            System.out.println(result);
            System.out.println(result2 + " " + result3);
        }
        sc.close();
    }
}