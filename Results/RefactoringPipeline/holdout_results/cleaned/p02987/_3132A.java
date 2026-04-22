import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four characters: ");
        String input = scanner.nextLine().trim();

        if (input.length() != 4) {
            System.out.println("Invalid input. Please enter exactly four characters.");
            return;
        }

        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);

        if (a == b || c == d || a == c || b == d || a == d || b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}