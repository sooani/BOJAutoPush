import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int result = 0;

        if(A < 0){
            result = (Math.abs(A) * C) + D + (B * E);
        }else if(A > 0){
            result = (B - A) * E;
        }
        System.out.println(result);
    }
}
