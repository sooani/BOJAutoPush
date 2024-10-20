import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행
        ArrayList<Integer> results = new ArrayList<>(); // 결과 저장

        for (int i = 0; i < T; i++) {
            // 쉼표로 구분된 두 숫자를 입력받고 처리
            String input = sc.nextLine();
            String[] numbers = input.split(",");
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);

            results.add(A + B);
        }
        for (int result : results) {
            System.out.println(result);
        }
    }
}