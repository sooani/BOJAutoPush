import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String number = scanner.next();
        scanner.close();

        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += number.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}
