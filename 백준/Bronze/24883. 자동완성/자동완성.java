import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        
        if(c.equals("N") || c.equals("n")){
            System.out.println("Naver D2");
        }else{
            System.out.println("Naver Whale");
        }
        scanner.close();
    }
}