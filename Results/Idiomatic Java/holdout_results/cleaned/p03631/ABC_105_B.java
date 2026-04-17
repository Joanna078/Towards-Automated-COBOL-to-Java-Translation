import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-character string: ");
        String input = scanner.nextLine();

        if (input.length() == 3 && input.charAt(0) == input.charAt(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}