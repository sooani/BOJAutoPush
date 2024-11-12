import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C_U = sc.nextInt();
        int D_U = sc.nextInt();

        int C_D = sc.nextInt();
        int D_D = sc.nextInt();

        int C_P = sc.nextInt();
        int D_P = sc.nextInt();

        int H = sc.nextInt() - D_U - D_D - D_P;

        sc.close();
        int time = 0;
        int result = 0;

        while (result < H) { // 체력이 다 떨어질때까지 반복
            time++;

            if (time % C_U == 0) { // time이 C_U의 배수일때만 데미지
                result += D_U;
            }
            if (time % C_D == 0) {
                result += D_D;
            }
            if (time % C_P == 0) {
                result += D_P;
            }
        }
        System.out.println(time);
    }
}