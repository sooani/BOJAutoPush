import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count  = 0; // 소수 개수
        int max = 1000; // 최대값
        
        boolean isPrime[] = new boolean[max +1];
        
        for(int i = 2; i <= max; i++){
            isPrime[i] = true; // 모두 소수라고 가정
        }
        for(int i = 2; i * i <= max; i++){
            if(isPrime[i]){ // i가 소수라면
                for(int j = i * i; j <= max; j += i){ // i의 배수는 제외
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 0; i < N; i++){ // N의 숫자 입력받아서 소수 확인
            int n = sc.nextInt();
            if(isPrime[n]){
                count++;
            }
        }
        System.out.println(count);
    }
}