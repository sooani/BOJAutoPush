import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) { //각 줄
            for (int j = 0; j < i; j++) { // 공백은 i개
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (N - i) - 1; k++) { //줄어드는 별 2*N-i-1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}