import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double M = (B - A) / 400.0;
        double P = 1.0 / (1 + Math.pow(10, M));
        System.out.println(P);
        sc.close();
    }
}