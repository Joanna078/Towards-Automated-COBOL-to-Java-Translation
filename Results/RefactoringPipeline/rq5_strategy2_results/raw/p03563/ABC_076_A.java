```java
import java.util.Scanner;

public class ABC_076_A {

    private int R;
    private int G;
    private int ZS;
    private String ans = "     ";
    private char DUMMY;

    public static void main(String[] args) {
        ABC_076_A program = new ABC_076_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT R
        System.out.print("Enter R: ");
        R = scanner.nextInt();

        // ACCEPT G
        System.out.print("Enter G: ");
        G = scanner.nextInt();

        // SUBTRACT R FROM G GIVING R
        R = G - R;

        // ADD G TO R
        R += G;

        // MOVE R TO ZS
        ZS = R;

        // PERFORM UNANS
        unans();

        // DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans))
        System.out.println(ans.trim());

        scanner.close();
    }

    private void unans() {
        // UNSTRING ZS DELIMITED BY ALL SPACE INTO DUMMY ans
        String zsStr = Integer.toString(ZS);
        if (zsStr.length() > 0) {
            DUMMY = zsStr.charAt(0);
            if (zsStr.length() > 1) {
                ans = zsStr.substring(1);
            }
        }
    }
}
```