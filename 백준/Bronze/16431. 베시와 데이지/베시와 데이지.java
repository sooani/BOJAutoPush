import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bx = sc.nextInt(), By = sc.nextInt();
        int Dx = sc.nextInt(), Dy = sc.nextInt();
        int Jx = sc.nextInt(), Jy = sc.nextInt();

        int B = Math.max(Math.abs(Bx - Jx), Math.abs(By - Jy));
        int D = Math.abs(Dx - Jx) + Math.abs(Dy - Jy);

        if (B < D) {
            System.out.println("bessie");
        } else if (B > D) {
            System.out.println("daisy");
        } else {
            System.out.println("tie");
        }
        sc.close();
    }
}
