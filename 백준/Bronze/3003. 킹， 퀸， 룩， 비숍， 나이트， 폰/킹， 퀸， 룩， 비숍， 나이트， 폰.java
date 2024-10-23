import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] expected = {1,1,2,2,2,8};
        int[] actual = new int[6];

        for(int i = 0; i < 6; i++){
            actual[i] = sc.nextInt();
        }
        for(int i = 0; i < 6; i++){
            System.out.println((expected[i] - actual[i]));
        }
        sc.close();
    }
}