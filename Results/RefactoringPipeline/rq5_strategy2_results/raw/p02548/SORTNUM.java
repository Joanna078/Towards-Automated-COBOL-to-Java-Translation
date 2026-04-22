```java
import java.util.Scanner;

public class SortNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    int res = a * b + c;
                    if (res > n) {
                        break;
                    }
                    if (res == n) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.printf("%05d%n", count);
    }
}
```