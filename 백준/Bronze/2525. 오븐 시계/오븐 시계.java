import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cookT = sc.nextInt();

        min += cookT;
        hour += min / 60;
        min %= 60;
        hour %= 24;
        System.out.println(hour + " " + min);
        sc.close();
    }
}