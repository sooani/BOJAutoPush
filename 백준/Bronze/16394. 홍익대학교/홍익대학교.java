import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N >= 1946){
            int result = N - 1946;
            System.out.println(result);
        }
        sc.close();
    }
}