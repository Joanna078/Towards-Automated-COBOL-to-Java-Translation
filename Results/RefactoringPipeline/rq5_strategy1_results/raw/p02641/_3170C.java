```java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private byte[] inp = new byte[400];
    private short x = 0;
    private short n = 0;
    private short p1 = 0;
    private short p2 = 0;
    private byte[] tbl1 = new byte[306];
    private short i = 0;
    private short idx = 0;
    private short cnt = 0;
    private byte[] out = new byte[3];

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input:");
        String input = scanner.nextLine();
        inp = input.getBytes(StandardCharsets.UTF_8);

        unstring(inp, ' ', 1, new byte[]{x}, new byte[]{n});
        System.out.println("Enter input:");
        input = scanner.nextLine();
        inp = input.getBytes(StandardCharsets.UTF_8);

        tbl1 = new byte[306];
        p1 = 1;

        for (i = 1; i <= n; i++) {
            for (p2 = p1; p2 <= inp.length; p2++) {
                if (inp[p2 - 1] == ' ') {
                    break;
                }
            }
            idx = (short) (p2 - p1);
            System.arraycopy(str_0_001, 0, tbl1, 3 * idx, 3);
            p1 = (short) (p2 + 1);
        }

        if (n == 0 || tbl1[3 * (x - 1)] == '0') {
            cnt = x;
        } else {
            idx = 1;
            for (i = 1; i <= n; i++) {
                if (tbl1[3 * (x - i - 1)] == '0' || tbl1[3 * (x + i - 1)] == '0') {
                    break;
                }
            }
            if (tbl1[3 * (x - i - 1)] == '0') {
                cnt = (short) (x - i);
            } else {
                cnt = (short) (x + i);
            }
        }

        out = String.valueOf(cnt).getBytes(StandardCharsets.UTF_8);
        System.out.println("Output: " + new String(out, StandardCharsets.UTF_8));
    }

    private void unstring(byte[] source, char delimiter, int count, byte[] target1, byte[] target2) {
        int index = 0;
        int targetIndex = 0;
        while (index < source.length && targetIndex < count) {
            if (source[index] == delimiter) {
                targetIndex++;
            } else {
                target1[targetIndex] = source[index];
                target2[targetIndex] = source[index];
            }
            index++;
        }
    }

    private static final byte[] str_0_001 = "001".getBytes(StandardCharsets.UTF_8);
}
```