import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();

        char[] ch = {'u', 'o', 's', 'p', 'c'};
        int[] counts = new int[ch.length];

        for (char c : S.toCharArray()) {
            for (int i = 0; i < ch.length; i++) {
                if (c == ch[i]) {
                    counts[i]++;
                }
            }
        }
        int max = Integer.MAX_VALUE;
        for (int count : counts) {
            max = Math.min(max, count);
        }
        System.out.println(max);
        sc.close();
    }
}