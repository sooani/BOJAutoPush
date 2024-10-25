import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        // 'h'를 제외한 부분에서 'a'의 개수를 구함
        int count1 = A.length() - 1;
        int count2 = B.length() - 1;

        if (count1 >= count2) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}