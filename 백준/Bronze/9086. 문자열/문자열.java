import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();//테이스케이스 개수
        scanner.nextLine();

        String[] array = new String[T];//배열 생성

        for ( int i = 0; i < T; i++ ){ //테스트케이스만큼 반복해서 문자열 입력받음
            array[i] = scanner.nextLine();//개행기준으로 입력 구분
        }
        for ( int i = 0; i < T; i++ ){
            System.out.print(array[i].charAt(0));
            System.out.println(array[i].charAt(array[i].length()-1));
        }
    }
}