import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int run = sc.nextInt();
        int bus = sc.nextInt();
        int sub = sc.nextInt();
        if(bus == sub){
            System.out.println("Anything");
        }else if(bus < sub){
            System.out.println("Bus");
        }else {
            System.out.println("Subway");
        }
        sc.close();
    }
}