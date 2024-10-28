import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long sum = (m - n + 1) * (n + m) / 2;

            System.out.println("Scenario #" + i + ":");
            System.out.println(sum);
            System.out.println();
        }
    }
}