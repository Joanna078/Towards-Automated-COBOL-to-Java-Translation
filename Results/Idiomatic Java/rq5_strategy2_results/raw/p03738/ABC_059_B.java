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

        // Initialize strA and strB with spaces
        StringBuilder strA = new StringBuilder(" ".repeat(101));
        StringBuilder strB = new StringBuilder(" ".repeat(101));

        // Append zeros to strA
        for (int i = 0; i < numA; i++) {
            strA.append("0");
        }
        strA.append(A);

        // Append zeros to strB
        for (int i = 0; i < numB; i++) {
            strB.append("0");
        }
        strB.append(B);

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