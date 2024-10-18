import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // 기차 속도
        int T = sc.nextInt(); // 파리 속도
        int D = sc.nextInt(); // 두 기차사이 거리

        if (0 < S && 0 < T && 0 < D) {
            int F = 0; // 파리 이동거리
            int time = 0; // 두 기차 만나는 시간

            time = D / (S * 2);
            F = time * T;
            System.out.println(F);
        }
        sc.close();
    }
}