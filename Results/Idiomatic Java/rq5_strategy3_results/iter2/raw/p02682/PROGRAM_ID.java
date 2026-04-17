```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        scanner.close();

        String[] parts = ln.split("\\s+");
        long A = Long.parseLong(parts[0]);
        long B = Long.parseLong(parts[1]);
        long C = Long.parseLong(parts[2]);
        long K = Long.parseLong(parts[3]);

        long ans;
        if (K <= A) {
            ans = K;
        } else if (K <= A + B) {
            ans = A;
        } else {
            ans = A - (K - A - B);
        }

        System.out.println(String.valueOf(ans));
    }
}
```