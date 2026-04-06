```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.print("Enter a three-character string: ");
        String n = scanner.nextLine();
        
        // Check if any character is '7'
        boolean containsSeven = false;
        for (int i = 0; i < n.length() && !containsSeven; i++) {
            if (n.charAt(i) == '7') {
                containsSeven = true;
            }
        }
        
        // Display result
        if (containsSeven) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```