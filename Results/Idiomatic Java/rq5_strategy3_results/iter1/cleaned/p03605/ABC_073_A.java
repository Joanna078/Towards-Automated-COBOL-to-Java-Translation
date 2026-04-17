import java.util.Scanner;

public class ABC_073_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String inp = scanner.nextLine();

        if (inp.length() != 2) {
            System.out.println("Invalid input. Please enter exactly two characters.");
            return;
        }

        char firstChar = inp.charAt(0);
        char secondChar = inp.charAt(1);

        if (firstChar == '9' || secondChar == '9') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}