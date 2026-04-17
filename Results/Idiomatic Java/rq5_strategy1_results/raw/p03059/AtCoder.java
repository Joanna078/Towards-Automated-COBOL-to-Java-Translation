```java
import java.math.BigDecimal;
import java.util.Scanner;

public class AtCoder {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);

    private int b_RETURN_CODE;
    private String b_INP = " ".repeat(100);
    private String b_A = "0".repeat(15);
    private String b_B = "0".repeat(15);
    private String b_C = "0".repeat(15);
    private String b_E = "0".repeat(15);
    private String b_D = "0".repeat(15);
    private String b_X = "0".repeat(15);
    private String b_Y = "0".repeat(15);
    private String b_W = "0".repeat(15);
    private String b_F = "0".repeat(10);
    private String b_t = "0".repeat(15);
    private String b_temp1 = "0".repeat(15);
    private String b_temp2 = "0".repeat(15);
    private String b_temp3 = "0".repeat(15);
    private String b_N = "0".repeat(15);

    public static void main(String[] args) {
        new AtCoder().run();
    }

    public void run() {
        if (!initialized) {
            initialize();
        }

        Scanner scanner = new Scanner(System.in);
        b_INP = scanner.nextLine();

        int index1 = findFirstSpace(b_INP);
        b_A = b_INP.substring(0, index1).trim();

        int index2 = findNextSpace(b_INP, index1 + 1);
        b_B = b_INP.substring(index1 + 1, index2).trim();

        int index3 = findNextSpace(b_INP, index2 + 1);
        b_C = b_INP.substring(index2 + 1, index3).trim();

        d0 = new BigDecimal(b_C);
        d1 = new BigDecimal(b_A);
        d0 = d0.divide(d1, 4, BigDecimal.ROUND_HALF_UP);

        d1 = new BigDecimal(b_B);
        d0 = d0.multiply(d1);

        b_F = d0.toString();

        System.out.println(b_F);
    }

    private void initialize() {
        initialized = true;
    }

    private int findFirstSpace(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                return i;
            }
        }
        return input.length();
    }

    private int findNextSpace(String input, int startIndex) {
        for (int i = startIndex; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                return i;
            }
        }
        return input.length();
    }
}
```