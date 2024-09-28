import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        scanner.nextLine();
        
        String[] strings = new String[n];
        
        for(int i = 0; i < n; i++){
            strings[i] = scanner.nextLine();
            
            if(strings[i].length() >= 6 && strings[i].length() <= 9 ){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }   
        scanner.close();
    }
}