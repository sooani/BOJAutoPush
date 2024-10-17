import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0; // 가장 작은 생성자

        for (int i = 0; i < N; i++) { // 1부터 N까지 분해합 계산
            int sum = i; // 자기자신 더하고 시작
            int temp = i; // 자릿수

            while (temp > 0) {
                sum += temp % 10; // 마지막 자릿수 더함
                temp /= 10; // 한자리 줄임
            }
            if (sum == N) { //  분해합이 N이랑 같으면 i는 N의 생성자
                result = i; // 생성자 저장
                break;
            }
        }
        System.out.println(result);
    }
}