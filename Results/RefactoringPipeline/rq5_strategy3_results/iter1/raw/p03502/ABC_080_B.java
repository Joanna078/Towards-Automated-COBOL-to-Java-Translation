```java
import java.util.Scanner;

public class ABC_080_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int sumOfDigits = 0;
        int temp = n;

        // Calculate the sum of digits
        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        // Check if the number is a Harshad number
        if (n % sumOfDigits == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```