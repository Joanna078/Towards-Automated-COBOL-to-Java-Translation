import java.util.Scanner;

public class ABC_080_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = scanner.nextLong();
        scanner.close();

        if (isHarshadNumber(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isHarshadNumber(long n) {
        long originalNumber = n;
        long sumOfDigits = 0;

        while (n > 0) {
            sumOfDigits += n % 10;
            n /= 10;
        }

        return originalNumber % sumOfDigits == 0;
    }
}