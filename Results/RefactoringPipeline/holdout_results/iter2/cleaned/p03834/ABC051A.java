import java.util.Scanner;

public class ABC051A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // Replace all commas with spaces
        String result = input.replace(',', ' ');
        
        // Display the result
        System.out.println(result);
        
        scanner.close();
    }
}