import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long result = 1;
        
        // N이 0이면 0! = 1로 처리
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}