import java.util.Scanner;

public class ALREADY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for S: ");
        String s = scanner.nextLine();
        
        // Move "2018" to the first 4 characters of S
        s = "2018" + s.substring(4);
        
        System.out.println(s);
    }
}