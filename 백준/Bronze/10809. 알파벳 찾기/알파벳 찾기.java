import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        for(char c = 'a'; c <= 'z'; c++) {
            int position = S.indexOf(c);
            System.out.print(position + " ");
        }
    }
}