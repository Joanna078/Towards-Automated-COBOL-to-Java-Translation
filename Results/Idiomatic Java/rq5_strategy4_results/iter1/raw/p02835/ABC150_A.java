```java
import java.util.Scanner;

public class ABC150_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        int p1 = 0;
        int[] values = new int[3];

        for (int i = 0; i < 3; i++) {
            int p2 = 0;
            while (p1 + p2 < inputLine.length() && inputLine.charAt(p1 + p2) != ' ') {
                p2++;
            }
            values[i] = Integer.parseInt(inputLine.substring(p1, p1 + p2).trim());
            p1 += p2 + 1;
        }

        int sum = values[0] + values[1] + values[2];
        if (sum <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}
```