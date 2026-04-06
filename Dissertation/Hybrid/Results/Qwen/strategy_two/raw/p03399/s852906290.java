```java
import java.util.Scanner;

public class ABC_092_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Calculate X and Y
        int X = Math.min(A, B);
        int Y = Math.min(C, D);

        // Add X and Y
        int ZS = X + Y;

        // Convert ZS to string and split into dummy and answer
        String zsStr = String.format("%04d", ZS); // Change to %04d to remove leading zero
        char[] dummyAndAnswer = zsStr.toCharArray();

        // Display the answer
        System.out.println(new String(dummyAndAnswer, 0, dummyAndAnswer.length)); // Change index to 0

        scanner.close();
    }
}
```