import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String binaryRepresentation = convertDecimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryRepresentation);
    }

    private static String convertDecimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binaryString = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryString.insert(0, remainder);
            decimalNumber /= 2;
        }
        return binaryString.toString();
    }
}