import java.util.Scanner;

public class Main {

    private static final String NO = "No";
    private static final String YES = "Yes";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three characters: ");
        String input = scanner.nextLine().trim();

        if (input.length() != 3) {
            System.out.println("Please enter exactly three characters.");
            return;
        }

        char firstChar = input.charAt(0);
        char secondChar = input.charAt(1);
        char thirdChar = input.charAt(2);

        if (firstChar == secondChar && secondChar == thirdChar) {
            System.out.println(NO);
        } else {
            System.out.println(YES);
        }
    }
}