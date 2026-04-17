```java
import java.util.Scanner;

public class ABC_060_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);

        int num = A;
        int i = 1;
        int pi = 0;
        boolean flag = false;

        while (A * B >= num) {
            if (num % B == C) {
                flag = true;
                break;
            }
            pi = i++;
            num = pi * A;
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```