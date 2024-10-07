import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String line = sc.nextLine();
            
            if(line.equals("EOI")){
                break;
            }
            if(line.toLowerCase().contains("nemo")){
                System.out.println("Found");
            }else{
                System.out.println("Missing");
            }
        }
        sc.close();
    }
}