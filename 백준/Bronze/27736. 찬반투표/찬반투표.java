import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ap = 0;
        int rj = 0;
        int iv = 0;

        for (int i = 0; i < N; i++) {
            int vote = sc.nextInt();
            if (vote == 1) {
                ap++;
            } else if (vote == -1) {
                rj++;
            } else {
                iv++;
            }
        }
        if(iv >= N / 2.0){ // 기권자가 절반이상
            System.out.println("INVALID");
        }else if(ap > rj){
            System.out.println("APPROVED"); // 찬성이 반대보다 많을때
        }else{
            System.out.println("REJECTED"); // 반대가 많거나 찬성과 반대가 같을때
        }
        sc.close();
    }
}