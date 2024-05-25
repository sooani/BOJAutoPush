import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //테스트 개수
        for (int t = 0; t < T; t++) {
            int R = sc.nextInt();
            String S = sc.next();

            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                for (int j = 0; j < R; j++) {
                    System.out.print(ch);
                }
            }
            System.out.println(); //테스트 줄바꿈
        }
    }
}