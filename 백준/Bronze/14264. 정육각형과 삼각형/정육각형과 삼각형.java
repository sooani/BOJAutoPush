import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        double S = (Math.sqrt(3) * L * L) / 4; // 정삼각형의 넓이
        System.out.println(S);
        sc.close();
    }
}