```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        int A = Integer.parseInt(parts[0].trim());
        int B = Integer.parseInt(parts[1].trim());
        int OUT = 0;

        if (A == B) {
            OUT = A * 2;
        } else if (A > B) {
            OUT = A * 2 - 1;
        } else {
            OUT = B * 2 - 1;
        }

        System.out.println(OUT);
    }
}
```