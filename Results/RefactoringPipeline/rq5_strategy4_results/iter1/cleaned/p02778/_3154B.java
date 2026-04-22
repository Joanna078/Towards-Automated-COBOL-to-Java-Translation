import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        StringBuilder result = new StringBuilder(parts[0].length());

        for (int i = 0; i < parts[0].length(); i++) {
            result.append('x');
        }

        System.out.println(result.toString());
    }
}