```java
import java.util.Scanner;

public class AtCoder {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int f = 0;
    private int e = 0;
    private int temp1 = 0;
    private int temp2 = 0;
    private int n = 0;

    public static void main(String[] args) {
        new AtCoder().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        inp = scanner.nextLine();
        scanner.close();

        if (inp.length() > 0) {
            temp1 = 1;
            while (temp1 <= inp.length() && inp.charAt(temp1 - 1) != ' ') {
                temp1++;
            }
            temp1 -= 1;

            a = Integer.parseInt(inp.substring(0, temp1));

            temp2 = temp1 + 1;
            while (temp2 <= inp.length() && inp.charAt(temp2 - 1) != ' ') {
                temp2++;
            }
            temp2 -= 1;

            b = Integer.parseInt(inp.substring(temp1, temp2));

            n = temp2 - temp1 - 1;

            if (a >= 13) {
                e = b;
            } else if (a >= 6) {
                e = b / 2;
            } else {
                e = 0;
            }

            System.out.println(e);
        }
    }
}
```