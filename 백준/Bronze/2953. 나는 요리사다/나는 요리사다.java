import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0;
        int winner = 0;

        for (int i = 1; i <= 5; i++) {
            int num = 0;
            for (int j = 0; j < 4; j++) {
                num += sc.nextInt();
            }
            if (win < num) {
                win = num;
                winner = i;
            }
        }
        System.out.println(winner + " " + win);
    }
}