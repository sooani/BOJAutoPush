import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int count = st.trim().isEmpty() ? 0 : st.trim().split(" ").length;
        System.out.println(count);
    }
}