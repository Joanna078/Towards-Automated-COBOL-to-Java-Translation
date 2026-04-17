```java
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String s = "";
    private int cnt = 0;
    private char sw = '0';
    private int i = 0;
    private String out = " ";
    private char x = ' ';

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        s = scanner.nextLine();
        scanner.close();

        unstringAndProcess();
        displayResult();
    }

    private void unstringAndProcess() {
        String[] parts = s.split(" ");
        if (parts.length > 0) {
            cnt = Integer.parseInt(parts[0]);
        }

        sw = '0';
        out = "Yes";

        for (i = 1; i <= cnt && "No".equals(out); i++) {
            x = s.charAt(i - 1);
            if (!isValidCharacter(x)) {
                out = "No";
            }
            sw = (char) ('0' + (sw - '0' + 1) % 2);
        }
    }

    private boolean isValidCharacter(char ch) {
        return (ch == 'R' || ch == 'U' || ch == 'D') && sw == '0' ||
               (ch == 'L' || ch == 'U' || ch == 'D') && sw == '1';
    }

    private void displayResult() {
        System.out.println(out);
    }
}
```