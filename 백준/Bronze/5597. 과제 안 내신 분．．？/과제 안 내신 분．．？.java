import java.util.Scanner;
import java.util.HashSet;  

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        
        for(int i = 1; i <= 30; i++){
            numbers.add(i);           
        } // 1부터 30까지 해시셋에 추가
        
        for(int i = 0; i < 28; i++){
            int n = scanner.nextInt();
            numbers.remove(n); // 입력된 숫자는 해시셋에서 제거
        }
        
        for(int num : numbers){
            System.out.println(num);
        }
        scanner.close();
    }
}