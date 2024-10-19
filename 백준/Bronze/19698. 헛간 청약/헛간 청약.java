import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 소
        int W = sc.nextInt(); // 헛간 가로
        int H = sc.nextInt(); // 헛간 세로
        int L = sc.nextInt(); // 소의 방 크기

        int max = (W/L) * (H/L); // 최대 소의 수
        int result = Math.min(max,N); // 실제 배치가능한 소 N이랑 배치가능한 소
        System.out.println(result);
    }
}