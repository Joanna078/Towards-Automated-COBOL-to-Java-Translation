```java
import java.util.Scanner;

public class ABC150_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input line: ");
        String inputLine = scanner.nextLine();
        scanner.close();

        int p1 = 0;
        int a1 = extractNumber(inputLine, p1);
        p1 += findNextSpace(inputLine, p1) + 1;
        int a2 = extractNumber(inputLine, p1);
        p1 += findNextSpace(inputLine, p1) + 1;
        int a3 = extractNumber(inputLine, p1);

        if (a1 + a2 + a3 <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }

    private static int extractNumber(String inputLine, int startIndex) {
        int number = 0;
        for (int i = startIndex; i < inputLine.length(); i++) {
            char c = inputLine.charAt(i);
            if (c == ' ') {
                break;
            }
            number = number * 10 + Character.getNumericValue(c);
        }
        return number;
    }

    private static int findNextSpace(String inputLine, int startIndex) {
        for (int i = startIndex; i < inputLine.length(); i++) {
            if (inputLine.charAt(i) == ' ') {
                return i - startIndex;
            }
        }
        return inputLine.length() - startIndex;
    }
}
```