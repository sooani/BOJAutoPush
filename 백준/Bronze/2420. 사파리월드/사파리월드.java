import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long M = sc.nextLong();
        long N = sc.nextLong();
        long result = Math.abs(M-N);
        System.out.println(result);
        sc.close();
    }
}