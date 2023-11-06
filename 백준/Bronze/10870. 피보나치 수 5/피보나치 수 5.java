import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = new int[n+1];

            if( n <=1 ){
                    result[n] = n;
            }else  {
                result[0] = 0;
                result[1] = 1;

                for (int i = 2; i <= n; i++){
                    result[i] = result[i-1] + result[i-2];
            }
        }
        System.out.println(result[n]);
    }
}