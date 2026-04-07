import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        short a = scanner.nextShort();
        short b = scanner.nextShort();
        short c = scanner.nextShort();
        short x = scanner.nextShort();
        
        int ans = 0;
        
        // Perform nested loops
        for (short i = 0; i <= a; i++) {
            for (short j = 0; j <= b; j++) {
                for (short k = 0; k <= c; k++) {
                    int tmp1 = i * 500 + j * 100 + k * 50;
                    if (tmp1 == x) {
                        ans++;
                    }
                }
            }
        }
        
        // Display result
        System.out.printf("%d%n", ans);
    }
}