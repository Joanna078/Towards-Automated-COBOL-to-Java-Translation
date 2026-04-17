```java
import java.util.Scanner;

public class Answer {

    private boolean initialized = false;
    private int returnCode = 0;
    private int a = 0;
    private int b = 0;
    private int ans = 0;

    public static void main(String[] args) {
        new Answer().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers separated by space:");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length == 2) {
            try {
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[1]);
                process();
                displayResult();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter two integers.");
            }
        } else {
            System.out.println("Please enter exactly two numbers.");
        }
    }

    private void process() {
        while (a <= b) {
            if (a % 10 == 0 && (a / 10) % 10 == 0) {
                ans++;
            }
            a++;
        }
    }

    private void displayResult() {
        System.out.println("Result: " + ans);
    }
}
```