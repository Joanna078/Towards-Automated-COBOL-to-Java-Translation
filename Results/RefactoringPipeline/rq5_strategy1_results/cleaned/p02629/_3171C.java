import java.util.Scanner;

public class Main {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final int MAX_LENGTH = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long inputNumber = scanner.nextLong();
        scanner.close();

        String result = convertNumberToAlphabet(inputNumber);
        System.out.println(result);
    }

    private static String convertNumberToAlphabet(long number) {
        StringBuilder output = new StringBuilder(MAX_LENGTH);
        output.append(" ".repeat(MAX_LENGTH));

        while (number > 0) {
            number--;
            int remainder = (int) (number % 26);
            char letter = ALPHABET.charAt(remainder);
            output.setCharAt(output.length() - 1, letter);
            number /= 26;
        }

        return output.toString().trim();
    }
}