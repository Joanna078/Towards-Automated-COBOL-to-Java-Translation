```java
import java.util.Scanner;

public class Answer {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inputValues = "";
    private String calcValues = "";
    private String dispCalcValues = "No   ";

    public static void main(String[] args) {
        new Answer().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values: ");
        inputValues = scanner.nextLine();
        processInput();
        System.out.println("Result: " + dispCalcValues);
    }

    private void processInput() {
        if (!initialized) {
            initialize();
        }

        String[] parts = inputValues.split("\\s+");
        String a = parts[0];
        String b = parts[1];

        inputValues = a.trim() + b.trim();
        calcValues = inputValues;

        for (int i = 1; i <= 1000; i++) {
            if (i * i == Integer.parseInt(calcValues)) {
                dispCalcValues = "Yes  ";
                break;
            }
        }
    }

    private void initialize() {
        initialized = true;
    }
}
```