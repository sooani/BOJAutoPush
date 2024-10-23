import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> X = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            X.add(sc.nextInt());
        }
        int count = 0;
        int v = sc.nextInt();
        for (int num : X) {
            if (num == v) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}