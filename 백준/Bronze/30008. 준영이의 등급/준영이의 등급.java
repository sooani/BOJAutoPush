import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int P = sc.nextInt() * 100 / N;
            if (P <= 4) {
                System.out.print(1 + " ");
            } else if (P <= 11) {
                System.out.print(2 + " ");
            } else if (P <= 23) {
                System.out.print(3 + " ");
            } else if (P <= 40) {
                System.out.print(4 + " ");
            } else if (P <= 60) {
                System.out.print(5 + " ");
            } else if (P <= 77) {
                System.out.print(6 + " ");
            } else if (P <= 89) {
                System.out.print(7 + " ");
            } else if (P <= 96) {
                System.out.print(8 + " ");
            } else {
                System.out.print(9 + " ");
            }
        }
        sc.close();
    }
}