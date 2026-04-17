```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first line
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int N = Integer.parseInt(parts[0]);
        int X = Integer.parseInt(parts[1]);

        // Read second line
        input = scanner.nextLine();
        int[] L = new int[N];
        int P1 = 0;
        for (int i = 0; i < N; i++) {
            int P2 = P1;
            while (P2 < input.length() && input.charAt(P2) != ' ') {
                P2++;
            }
            L[i] = Integer.parseInt(input.substring(P1, P2));
            P1 = P2 + 1;
        }

        int Z = 0;
        int ZO = 0;
        int CNT = 0;
        while (Z <= X && CNT < N) {
            CNT++;
            Z = ZO + L[CNT - 1];
            ZO = Z;
        }

        System.out.println(CNT);
    }
}
```