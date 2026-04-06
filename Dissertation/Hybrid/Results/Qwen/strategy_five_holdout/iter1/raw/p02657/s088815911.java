```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input line from user
        String ln = scanner.nextLine();
        
        // Splitting the input into two parts based on space delimiter
        String[] parts = ln.split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        
        // Multiplying A and B
        int ans = A * B;
        
        // Formatting the result to remove leading zeros
        String zs = String.format("%d", ans).replaceFirst("^0+(?!$)", "");
        
        // Displaying the result
        System.out.println(zs);
        
        scanner.close();
    }
}
```