import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int N = sc.nextInt();

        sc.nextLine();

        String[] sub = new String[N];
        String frontNum = num.substring(0, 5);
        int result = 0;

        for (int i = 0; i < N; i++) {
            sub[i] = sc.nextLine();
        }
        for (String subs : sub) {
                if (frontNum.equals(subs.substring(0, 5))) {
                    result++;
                }
            }
        System.out.println(result);
    }
}