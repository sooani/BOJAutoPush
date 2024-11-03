import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            char code = S.charAt(i);
            if (code != 'J' && code != 'A' && code != 'V') {
                result.append(code);
            }
        }
        if (result.length() == 0) {
            System.out.println("nojava");
        } else {
            System.out.println(result.toString());
        }
        sc.close();
    }
}