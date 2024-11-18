import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int I = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println(arr[I-1]);
        sc.close();
    }
}