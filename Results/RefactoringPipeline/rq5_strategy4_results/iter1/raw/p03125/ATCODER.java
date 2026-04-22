```java
import java.util.Scanner;

public class ATCODER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split("\\s+");
        long a1 = Long.parseLong(parts[0]);
        long a2 = Long.parseLong(parts[1]);

        long g = a2 / a1;
        long r = a2 % a1;

        long result;
        if (r > 0) {
            result = a2 - a1;
        } else {
            result = a2 + a1;
        }

        System.out.println(result);
    }
}
```