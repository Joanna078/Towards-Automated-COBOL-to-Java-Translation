```java
import java.util.Scanner;

public class ABC_059_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input strings A and B
        System.out.print("Enter string A: ");
        String A = scanner.nextLine();
        System.out.print("Enter string B: ");
        String B = scanner.nextLine();

        // Calculate lengths
        int numA = 101 - A.length();
        int numB = 101 - B.length();

        // Pad strA with zeros
        StringBuilder strA = new StringBuilder(A);
        for (int i = 0; i < numA; i++) {
            strA.append('0');
        }

        // Pad strB with zeros
        StringBuilder strB = new StringBuilder(B);
        for (int i = 0; i < numB; i++) {
            strB.append('0');
        }

        // Compare strA and strB
        if (strA.toString().compareTo(strB.toString()) > 0) {
            System.out.println("GREATER");
        } else if (strA.toString().compareTo(strB.toString()) < 0) {
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }

        scanner.close();
    }
}
```