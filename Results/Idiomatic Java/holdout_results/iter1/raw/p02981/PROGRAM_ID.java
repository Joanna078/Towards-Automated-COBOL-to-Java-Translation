```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for N, A, B separated by spaces: ");
        String ln = scanner.nextLine();
        
        String[] parts = ln.split("\\s+");
        long N = Long.parseLong(parts[0]);
        long A = Long.parseLong(parts[1]);
        long B = Long.parseLong(parts[2]);
        
        long ans = Math.min(A * N, B);
        
        System.out.printf("%d%n", ans);
    }
}
```