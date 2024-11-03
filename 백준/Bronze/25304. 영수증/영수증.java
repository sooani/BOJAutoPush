import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int result = 0;
        for(int i  = 0; i < N; i++){
            int price = sc.nextInt();
            int count = sc.nextInt();
            result += price * count;
        }
        if(X == result){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}