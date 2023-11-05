import java.util.Scanner;

public class Main {//불기년도를 서기년도로 변환출력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        if (y >= 1000 && y <= 3000) {
            System.out.println(y - 543);
        }
    }
}