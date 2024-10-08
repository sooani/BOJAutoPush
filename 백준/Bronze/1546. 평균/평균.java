import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt(); // 과목 수
        int[] scores = new int[sub];
        
        for(int i = 0; i < sub; i++){ // 점수
            scores[i] = sc.nextInt();
        }
        int maxScore = 0; // 최대 점수
        for(int score : scores){
            if(score > maxScore){
                maxScore = score;
            }
        }
        double result = 0;
        for(int score : scores){
            result += (double) score / maxScore * 100;
        }
        System.out.println(result / sub);
    }
}