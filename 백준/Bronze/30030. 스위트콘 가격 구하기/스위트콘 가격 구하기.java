import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int B = scanner.nextInt();
        
        // 원래 가격
        int A = B / 11 * 10;

        System.out.println(A);   
        scanner.close();
    }
}