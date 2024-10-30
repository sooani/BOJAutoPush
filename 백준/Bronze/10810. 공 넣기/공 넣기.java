import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니
        int M = sc.nextInt(); // 바구니에 공 넣는 횟수
        int[] baskets = new int[N]; // 바구니 배열

        for (int t = 0; t < M; t++) {
            int i = sc.nextInt() - 1; // 시작
            int j = sc.nextInt() - 1; // 끝
            int k = sc.nextInt(); // 넣을 공의 번호

            for (int idx = i; idx <= j; idx++) {
                baskets[idx] = k;
            }
        }
        for(int b : baskets){
            System.out.print(b + " ");
        }
        sc.close();
    }
}