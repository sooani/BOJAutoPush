import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int birthY = scanner.nextInt();
        int birthM = scanner.nextInt();
        int birthD = scanner.nextInt();
        
        int currentY  = scanner.nextInt();
        int currentM = scanner.nextInt();
        int currentD = scanner.nextInt();
        
        int manAge = currentY - birthY;
        if(currentM < birthM || currentM == birthM && currentD < birthD){
            manAge--;
        }
        int countAge = currentY - birthY +1;
        int yearAge = currentY - birthY;
        
        System.out.println(manAge);
        System.out.println(countAge);
        System.out.println(yearAge);
    }
}