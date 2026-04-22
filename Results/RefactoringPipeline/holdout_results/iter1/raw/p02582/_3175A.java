```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of length 3: ");
        String s = scanner.nextLine().trim();

        int out = evaluateString(s);
        System.out.println(out);
    }

    private static int evaluateString(String s) {
        if (s.length() != 3) {
            throw new IllegalArgumentException("Input must be exactly 3 characters long.");
        }

        if ("RRR".equals(s)) {
            return 3;
        } else if (s.startsWith("RR") || s.substring(1).startsWith("RR")) {
            return 2;
        } else if (s.contains("R")) {
            return 1;
        } else {
            return 0;
        }
    }
}
```