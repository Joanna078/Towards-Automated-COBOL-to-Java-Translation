```java
import java.util.Scanner;

public class Test1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int S = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        int NOW1 = 0, NOW2 = 0, NOW3 = 0;

        for (int T = 1; T <= S; T++) {
            String INP = scanner.nextLine();
            int temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0;

            // Extract A
            while (temp1 < INP.length() && INP.charAt(temp1) != ' ') {
                temp1++;
            }
            int A = Integer.parseInt(INP.substring(0, temp1));

            // Extract B
            temp2 = temp1 + 2;
            while (temp2 < INP.length() && INP.charAt(temp2) != ' ') {
                temp2++;
            }
            int N = temp2 - temp1 - 2;
            int B = Integer.parseInt(INP.substring(temp1 + 2, temp1 + 2 + N));

            // Extract C
            temp1 = temp2 + 1;
            while (temp1 < INP.length() && INP.charAt(temp1) != ' ') {
                temp1++;
            }
            N = temp1 - temp2 - 1;
            int C = Integer.parseInt(INP.substring(temp2 + 1, temp2 + 1 + N));

            // Perform calculations
            temp1 = A - NOW1;
            temp2 = B - NOW2;
            temp3 = C - NOW3;
            temp2 += temp3;

            if (temp1 < temp2) {
                System.out.println("No");
                return;
            }

            temp2 = temp1 / 2;
            temp1 -= temp2 * 2;

            temp2 = B - NOW2;
            temp3 = temp2 / 2;
            temp2 -= temp3 * 2;

            temp3 = C - NOW3;
            temp4 = temp3 / 2;
            temp3 -= temp4 * 2;

            temp2 += temp3;
            temp2 -= 2;

            if (temp2 == 2) {
                temp2 = 0;
            }

            if (temp1 != temp2) {
                System.out.println("No");
                return;
            }

            NOW1 = A;
            NOW2 = B;
            NOW3 = C;
        }

        System.out.println("Yes");
    }
}
```