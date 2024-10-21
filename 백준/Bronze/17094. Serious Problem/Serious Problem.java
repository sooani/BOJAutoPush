import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        int count2 = 0;
        int counte = 0;

        for(char c : s.toCharArray()){
            if(c == '2'){
                count2++;
            }else if(c == 'e'){
                counte++;
            }
        }
        if(count2 > counte){
            System.out.println("2");
        }else if(count2 < counte){
            System.out.println("e");
        }else{
            System.out.println("yee");
        }
        sc.close();
    }
}