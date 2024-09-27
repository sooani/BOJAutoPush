import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int H = scanner.nextInt(); // 시간 입력
        int M = scanner.nextInt(); // 분 입력
        
        // 총 분 계산
        int totalMinutes = H * 60 + M - 45; // 45분을 빼기

        int a; // 시
        int b; // 분

        if (totalMinutes < 0) {
            totalMinutes += 24 * 60;
        }
        
        a = totalMinutes / 60; // 시 계산
        b = totalMinutes % 60;  // 분 계산
        
        System.out.println(a + " " + b); // 시와 분을 출력

        scanner.close();
    }
}