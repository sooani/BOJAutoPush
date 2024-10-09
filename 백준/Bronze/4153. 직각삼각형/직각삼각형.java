import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0){
                break;
            }
            // 가장 긴 변을 찾기
            int longest = Math.max(a, Math.max(b, c));
            int other1, other2;

            if (longest == a){
                other1 = b;
                other2 = c;
            }else if (longest == b){
                other1 = a;
                other2 = c;
            }else {
                other1 = a;
                other2 = b;
            }
            if (longest * longest == other1 * other1 + other2 * other2){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}