import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 각 경우의 수는 min(a, b, c)로 제한
            int count = Math.min(a, Math.min(b, c));
            System.out.println(count);
        }
        sc.close();
    }
}