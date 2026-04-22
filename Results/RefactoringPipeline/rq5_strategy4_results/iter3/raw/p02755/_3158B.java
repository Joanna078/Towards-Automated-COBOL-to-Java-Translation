```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        String[] parts = input.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);

        int P1 = (int) Math.round(A * 12.5);
        int P2 = B * 10;
        int PRI = Math.max(P1, P2);

        int T1 = (int) Math.round(PRI * 0.08);
        int T2 = (int) Math.round(PRI * 0.1);

        int OUT_PRI = (T1 != A || T2 != B) ? -1 : PRI;

        System.out.println(OUT_PRI);
    }
}
```