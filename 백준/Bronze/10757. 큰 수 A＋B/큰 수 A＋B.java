import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();
        System.out.println(num.add(num2));
    }
}
