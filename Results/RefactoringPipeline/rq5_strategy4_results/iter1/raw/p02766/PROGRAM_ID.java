```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing two numbers separated by space: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        long N = Long.parseLong(parts[0]);
        int K = Integer.parseInt(parts[1]);

        int cnt = 1;
        while (N >= Math.pow(K, cnt)) {
            cnt++;
        }

        System.out.printf("%02d%n", cnt);
    }
}
```