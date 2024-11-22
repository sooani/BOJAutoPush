import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int candy = sc.nextInt();
        int[] flavor = new int[candy];
        int result = 0;

        for (int i = 0; i < candy; i++) {
            flavor[i] = sc.nextInt();
        }
        for(int flavors : flavor){
            result += flavors;
        }
        if(result >= time){
            System.out.println("Padaeng_i Happy");
        }else{
            System.out.println("Padaeng_i Cry");
        }
        sc.close();
    }
}