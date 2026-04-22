```java
import java.util.Scanner;

public class Main {

    private int returnCode;
    private String inp;
    private String s;
    private int cnt;
    private int i;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        unstringAndProcess();
        displayResult();
    }

    private void unstringAndProcess() {
        String[] parts = inp.split(" ");
        if (parts.length > 0) {
            s = parts[0];
            cnt = s.length();
        }
    }

    private void displayResult() {
        System.out.println("Count: " + cnt);
    }
}
```