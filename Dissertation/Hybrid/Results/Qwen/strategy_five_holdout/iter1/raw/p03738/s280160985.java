```java
import java.util.Scanner;

public class ABC_059_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings A and B
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int numA = A.length();
        int numB = B.length();

        StringBuilder strA = new StringBuilder(A);
        StringBuilder strB = new StringBuilder(B);

        // Remove leading zeros from strA
        while (strA.length() > 0 && strA.charAt(0) == '0') {
            strA.deleteCharAt(0);
        }

        // Append A to strA
        strA.append(A);

        // Remove leading zeros from strB
        while (strB.length() > 0 && strB.charAt(0) == '0') {
            strB.deleteCharAt(0);
        }

        // Append B to strB
        strB.append(B);

        // Compare strA and strB
        if (strA.toString().compareTo(strB.toString()) > 0) {
            System.out.println("GREATER");
        } else if (strA.toString().compareTo(strB.toString()) < 0) {
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }
    }
}
```