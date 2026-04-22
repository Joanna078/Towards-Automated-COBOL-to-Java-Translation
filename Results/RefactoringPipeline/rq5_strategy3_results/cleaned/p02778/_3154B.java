import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] parts = input.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < parts.length; i++) {
            result.append("x".repeat(parts[i].length()));
        }
        
        System.out.println(result.toString());
    }
}