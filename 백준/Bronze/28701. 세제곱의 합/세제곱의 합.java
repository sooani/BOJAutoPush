import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        for (int i = 1; i <= N; i++) {
            num += i;
        }
        System.out.println(num);
        System.out.println(num * num);
        System.out.println(num * num);
    }
}