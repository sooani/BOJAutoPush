import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        long fac = 1;
        for(int i = 1; i <= sec; i++){
            fac *= i;
        }
        System.out.println(fac / 604800);
        sc.close();
    }
}