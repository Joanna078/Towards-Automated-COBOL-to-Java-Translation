import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three characters: ");
        String input = scanner.nextLine().trim();

        if (input.length() != 3) {
            System.out.println("Invalid input. Please enter exactly three characters.");
            return;
        }

        char s1 = input.charAt(0);
        char s2 = input.charAt(1);
        char s3 = input.charAt(2);

        if (s1 == s2 && s1 == s3) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}