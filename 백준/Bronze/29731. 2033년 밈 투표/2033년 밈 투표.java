import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] p = {"Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"};

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            boolean found = false;

            for (String str : p) { // 포함이 되는지 확인
                if (input.equals(str)) {
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Yes"); // 일치하지 않으면 Yes
                sc.close();
                return;
            }
        }
        System.out.println("No"); // 모두 일치하면 No
        sc.close();
    }
}