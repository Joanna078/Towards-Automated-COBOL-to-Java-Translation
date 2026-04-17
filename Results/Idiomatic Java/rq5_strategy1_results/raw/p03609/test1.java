```java
import java.util.Scanner;

public class Test1 {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private String a = "0";
    private String b = "0";
    private String re = "";

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        processInput();
        displayResult();
    }

    private void processInput() {
        int temp1 = 0;
        int temp2 = 0;

        // Find position of first space in inp
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                temp1 = i;
                break;
            }
        }

        // Extract A from inp
        a = inp.substring(0, temp1);

        // Find position of second space in inp
        for (int i = temp1 + 1; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                temp2 = i;
                break;
            }
        }

        // Extract B from inp
        b = inp.substring(temp1 + 1, temp2);

        // Compute N as difference between positions of spaces
        int n = temp2 - temp1 - 1;

        // Convert A and B to integers
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        // Subtract B from A if A is greater than or equal to B
        if (intA >= intB) {
            re = String.valueOf(intA - intB);
        } else {
            re = "000000000";
        }
    }

    private void displayResult() {
        System.out.println("Result: " + re);
    }
}
```