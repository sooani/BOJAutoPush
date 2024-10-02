import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String toggled = toggleCase(input);     
        System.out.println(toggled);
    }
    
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder();
        
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}