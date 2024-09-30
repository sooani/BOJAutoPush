import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idx = 0;
        int max = 0;
        
        for(int i = 0; i < 9; i++){
            int n = scanner.nextInt();
            if(n > max){
                max = n;
                idx = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
        scanner.close();
    }
}