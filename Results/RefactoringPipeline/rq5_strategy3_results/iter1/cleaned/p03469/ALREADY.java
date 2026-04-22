import java.util.Scanner;

public class ALREADY {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for S: ");
        String input = scanner.nextLine();
        
        StringBuilder s = new StringBuilder(input.substring(0, Math.min(10, input.length())));
        s.replace(0, 4, "2018");
        
        System.out.println(s.toString());
    }
}