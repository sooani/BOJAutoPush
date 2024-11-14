import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        if (N >= -32768 && N <= 32767) {
            System.out.println("short");
        } else if (N >= -2147483648 && N <= 2147483647) {
            System.out.println("int");
        } else {
            System.out.println("long long");
        }
        
        sc.close();
    }
}