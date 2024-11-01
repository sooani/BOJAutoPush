import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lv = sc.nextInt();
        int[] result = new int[lv];

        for (int i = 0; i < lv; i++) {
            int num = sc.nextInt();
            if (num == 300) {
                result[i] = 1;
            } else if (num >= 275 && num < 300) {
                result[i] = 2;
            } else if (num >= 250 && num < 275) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        for (int re : result) {
            System.out.print(re + " ");
        }
        sc.close();
    }
}