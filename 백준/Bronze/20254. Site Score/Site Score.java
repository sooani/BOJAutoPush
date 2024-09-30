import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int score = 56 * a + 24 * b + 14 * c + 6 * d;
        System.out.println(score);
        scanner.close();
    }
}