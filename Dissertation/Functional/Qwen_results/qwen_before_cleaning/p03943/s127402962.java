import java.util.Scanner;

public class ABC_047_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        // Data division
        int a, b, c;
        String[] parts = input.split("\\s+");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
        c = Integer.parseInt(parts[2]);
        
        // Processing section
        int x = a + b + c;
        int q = x / 2;
        int r = x % 2;
        
        // Output section
        if (r == 1) {
            System.out.println("No");
        } else {
            if (a == q || b == q || c == q) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program while using modern Java 17 features such as `Scanner` for input and string splitting with regular expressions. The code is also commented where necessary to explain complex logic.