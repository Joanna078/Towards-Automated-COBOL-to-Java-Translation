import java.util.Scanner;

public class ABC_062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String inp = scanner.nextLine();
        
        // Split input into H and W
        String[] parts = inp.split(" ");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);
        
        StringBuilder ln = new StringBuilder();
        
        // Loop until W + 2 < i
        for (int i = 1; i <= w + 2; i++) {
            ln.append('#');
        }
        
        System.out.println(ln.toString());
        
        // Loop until H < i
        for (int i = 1; i <= h; i++) {
            String a = scanner.nextLine();
            
            // Initialize ln with #
            ln.setLength(0);
            ln.append('#');
            
            // Append a
            ln.append(a);
            
            // Append #
            ln.append('#');
            
            System.out.println(ln.toString());
        }
        
        // Reset ln
        ln.setLength(0);
        
        // Loop until W + 2 < i
        for (int i = 1; i <= w + 2; i++) {
            ln.append('#');
        }
        
        System.out.println(ln.toString());
        
        scanner.close();
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program. It uses modern Java 17 features such as `StringBuilder` for efficient string manipulation and `Scanner` for input handling. The code is structured to maintain the same input/output behavior as the original COBOL program.