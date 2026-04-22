```java
import java.util.Scanner;

public class ABC_107_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "       ";
    private int n = 0;
    private int i = 0;
    private String ans = "   ";
    private int zs = 0;
    private char dummy = ' ';

    public static void main(String[] args) {
        ABC_107_A program = new ABC_107_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();
        scanner.close();

        unstring(inp, ' ', 0, 1);
        n = Integer.parseInt(f_N());
        i = Integer.parseInt(f_i());

        i -= n;
        i += 1;
        zs = i;

        unstring(Integer.toString(zs), ' ', 1, 0);
        ans = f_ans();

        System.out.println("Answer: " + ans);
    }

    private void unstring(String source, char delimiter, int skip, int count) {
        String[] parts = source.split(String.valueOf(delimiter));
        if (skip > 0) {
            parts = Arrays.copyOfRange(parts, skip, parts.length);
        }
        if (count > 0) {
            parts = Arrays.copyOf(parts, count);
        }

        switch (count) {
            case 1:
                f_ans(parts[0]);
                break;
            case 2:
                f_DUMMY(parts[0]);
                f_ans(parts[1]);
                break;
        }
    }

    private String f_N() {
        return inp.substring(0, 3);
    }

    private String f_i() {
        return inp.substring(3, 6);
    }

    private void f_ans(String value) {
        ans = value;
    }

    private void f_DUMMY(String value) {
        dummy = value.charAt(0);
    }
}
```