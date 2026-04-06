```java
import java.util.Scanner;

public class ABC111A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        
        // Convert '19' to '91'
        String strN = String.valueOf(n);
        strN = strN.replace("19", "91");
        
        // Display the result
        System.out.println(strN);
        
        scanner.close();
    }
}
```