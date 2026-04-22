import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-character string: ");
        String input = scanner.nextLine().trim();

        if (input.length() != 3) {
            System.out.println("Invalid input. Please enter exactly 3 characters.");
            return;
        }

        if (containsSeven(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean containsSeven(String input) {
        return input.indexOf('7') != -1;
    }
}