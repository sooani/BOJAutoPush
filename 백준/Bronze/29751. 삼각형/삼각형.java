import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double W = sc.nextDouble();
        double H = sc.nextDouble();
        double result = (W*H)/2;
        System.out.println(result);
        sc.close();
    }
}
