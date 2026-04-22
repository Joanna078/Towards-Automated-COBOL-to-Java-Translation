```java
import java.util.Scanner;

public class Test1 {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int temp1 = 0;
    private int temp2 = 0;
    private int temp3 = 0;
    private int temp4 = 0;
    private int n = 0;
    private int s = 0;
    private int t = 0;
    private int now1 = 0;
    private int now2 = 0;
    private int now3 = 0;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        s = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (t = 1; t <= s; t++) {
            System.out.print("Enter input: ");
            inp = scanner.nextLine();

            temp1 = 0;
            while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
                temp1++;
            }

            a = Integer.parseInt(inp.substring(0, temp1));

            temp1 += 1;
            temp2 = temp1;
            while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
                temp2++;
            }

            b = Integer.parseInt(inp.substring(temp1, temp2));

            temp2 += 1;
            temp3 = temp2;
            while (temp3 < inp.length() && inp.charAt(temp3) != ' ') {
                temp3++;
            }

            c = Integer.parseInt(inp.substring(temp2, temp3));

            n = temp2 - temp1;
            if (n != 2) {
                System.out.println("No");
                return;
            }

            n = temp3 - temp2;
            if (n != 2) {
                System.out.println("No");
                return;
            }

            n = b - now2;
            if (n != 2) {
                System.out.println("No");
                return;
            }

            n = c - now3;
            if (n != 2) {
                System.out.println("No");
                return;
            }

            now1 = a;
            now2 = b;
            now3 = c;
        }

        System.out.println("Yes");
    }
}
```