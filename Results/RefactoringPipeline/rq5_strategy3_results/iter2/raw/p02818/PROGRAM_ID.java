```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        long A = Long.parseLong(parts[0]);
        long B = Long.parseLong(parts[1]);
        long K = Long.parseLong(parts[2]);

        long mna = Math.min(A, K);
        A -= mna;
        mna = K - mna;
        long mnb = Math.min(B, mna);
        B -= mnb;

        String zsa = String.format("%18d", A);
        String zsb = String.format("%18d", B);

        String ans = zsa.trim() + " " + zsb.trim();
        System.out.println(ans);
    }
}
```