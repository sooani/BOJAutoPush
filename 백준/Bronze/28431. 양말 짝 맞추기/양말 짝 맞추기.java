import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        
        for(int i = 0; i < 5; i++){
            int n = scanner.nextInt();
            if(!numbers.add(n)){
                numbers.remove(n); // 중복이면 제거
            }
        }
        for(int num : numbers){
            System.out.println(num);   
        }
    }
}