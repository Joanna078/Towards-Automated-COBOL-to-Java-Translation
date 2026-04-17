import java.util.Scanner;

public class ABC_073_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String input = scanner.nextLine();

        if (input.length() == 2 && (input.charAt(0) == '9' || input.charAt(1) == '9')) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}