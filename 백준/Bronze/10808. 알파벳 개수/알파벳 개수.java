import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] count = new int[26];
        for(char c : input.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                count[c - 'a']++;
            }
        }
        for(int i = 0; i < 26; i++){
            System.out.print(count[i] + " ");
        }
        sc.close();
    }
}