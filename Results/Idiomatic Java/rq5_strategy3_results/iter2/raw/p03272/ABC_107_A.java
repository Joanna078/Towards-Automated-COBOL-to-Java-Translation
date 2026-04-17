```java
import java.util.Scanner;

public class ABC_107_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        String[] parts = inp.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int i = Integer.parseInt(parts[1]);

        i = N - i + 1;
        String zs = String.format("%03d", i);

        String ans = zs.substring(1);

        System.out.println(ans);
    }
}
```