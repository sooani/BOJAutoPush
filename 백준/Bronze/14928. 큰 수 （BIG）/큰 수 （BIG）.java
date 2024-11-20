import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        long num = 0;

        // 문자열의 각 자릿수를 처리하면서 나머지 계산
        for (int i = 0; i < N.length(); i++) {
            // 현재 자릿수를 정수로 변환 , 이전 N 값에 10을 곱한 후 더함
            num = (num * 10 + (N.charAt(i) - '0')) % 20000303;
        }
        System.out.println(num);
        sc.close();
    }
}