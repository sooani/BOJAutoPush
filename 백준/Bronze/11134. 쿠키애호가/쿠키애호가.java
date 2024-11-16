import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result = 0;
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int C = sc.nextInt();
            if (N > 0) {
                if (N % C == 0) {
                    result = N / C;
                } else if (N % C != 0) {
                    result = N / C + 1;
                }
                System.out.println(result);
            }
        }
        sc.close();
    }
}