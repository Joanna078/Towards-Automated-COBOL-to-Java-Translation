import java.util.Scanner;

public class ABC_101_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = scanner.nextLine();
        scanner.close();

        int sumOfDigits = 0;
        for (char c : n.toCharArray()) {
            if (Character.isDigit(c)) {
                sumOfDigits += Character.getNumericValue(c);
            }
        }

        int num = Integer.parseInt(n.replaceAll("\\D", ""));
        int remainder = num % sumOfDigits;

        if (remainder == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}