import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ( 0 < x && y < 0 ) {
            System.out.println(4);
        }else if ( 0 > x && y < 0 ) {
            System.out.println(3);
        }else if ( 0 > x && y > 0 ) {
            System.out.println(2);
        }else {
            System.out.println(1);
        }
    }
}