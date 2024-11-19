import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cards = new int[N];
        for(int i = 0; i < N; i++){
            cards[i] = sc.nextInt();
        }
        int result = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k]; // 세 카드의 합 i < j < k

                    if (sum <= M && sum > result) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}