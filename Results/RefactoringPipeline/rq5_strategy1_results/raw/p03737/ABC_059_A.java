```java
import java.util.Scanner;

public class ABC_059_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private String s1 = "";
    private String s2 = "";
    private String s3 = "";

    public static void main(String[] args) {
        ABC_059_A program = new ABC_059_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        unstringAndConvertToUpper();
        displayResults();
    }

    private void unstringAndConvertToUpper() {
        String[] parts = inp.split("\\s+");
        if (parts.length >= 3) {
            s1 = parts[0].toUpperCase();
            s2 = parts[1].toUpperCase();
            s3 = parts[2].toUpperCase();
        }
    }

    private void displayResults() {
        System.out.println(s1 + " " + s2 + " " + s3);
    }
}
```