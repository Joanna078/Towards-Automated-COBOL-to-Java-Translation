```java
import java.util.Scanner;

public class AtCoder {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        processInput();
    }

    private static void processInput() {
        System.out.print("Enter input: ");
        String input = scanner.nextLine();

        int spaceIndex = input.indexOf(' ');
        if (spaceIndex == -1) {
            System.out.println("-1");
            return;
        }

        String part1 = input.substring(0, spaceIndex).trim();
        String part2 = input.substring(spaceIndex + 1).trim();

        if (isValidNumber(part1) && isValidNumber(part2)) {
            int num1 = Integer.parseInt(part1);
            int num2 = Integer.parseInt(part2);
            int result = num1 * num2;
            System.out.println(result);
        } else {
            System.out.println("-1");
        }
    }

    private static boolean isValidNumber(String str) {
        return str.matches("\\d+");
    }
}
```