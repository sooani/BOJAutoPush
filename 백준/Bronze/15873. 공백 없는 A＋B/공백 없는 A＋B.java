import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.charAt(1) == '0'){ // 두번째 문자가 0이면 10 + 세번째부터 끝까지 정수로 변환
            System.out.println( 10 + Integer.parseInt(str.substring(2)));
        }else { // 0이 아니면 첫번째 문자 숫자로 변환 + 문자열의 두번째부터 끝까지 정수로 변환
            System.out.println(Character.getNumericValue(str.charAt(0)) + Integer.parseInt(str.substring(1)));
        }
        sc.close();
    }
}