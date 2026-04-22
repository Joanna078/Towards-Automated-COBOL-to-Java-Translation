```java
import java.util.Scanner;

public class Beginner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first line
        String inp = scanner.nextLine();
        String dtX1 = inp.trim();
        int inN = dtX1.length();

        // Read second line
        inp = scanner.nextLine();
        int[] inA = new int[100];
        int i = 0;
        int p1 = 0;
        while (i < inN) {
            while (p1 < inp.length() && !Character.isDigit(inp.charAt(p1))) {
                p1++;
            }
            int p2 = p1;
            while (p1 < inp.length() && Character.isDigit(inp.charAt(p1))) {
                p1++;
            }
            if (p1 > p2) {
                inA[i] = Integer.parseInt(inp.substring(p2, p1));
                i++;
            }
        }

        String outN = "APPROVED";
        for (int j = 0; j < inN; j++) {
            int inAw1 = inA[j] / 2;
            if (inA[j] == inAw1 * 2) {
                inAw1 = inA[j] / 3;
                int inAw2 = inA[j] / 5;
                if (inA[j] != inAw1 * 3 && inA[j] != inAw2 * 5) {
                    outN = "DENIED";
                    break;
                }
            }
        }

        System.out.println(outN);
    }
}
```