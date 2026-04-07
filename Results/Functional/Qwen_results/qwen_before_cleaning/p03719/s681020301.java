import java.util.Scanner;

public class ABC_061_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        // Split the input into individual strings
        String[] parts = input.split("\\s+");
        
        // Convert the string parts to integers
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        
        // Check the condition and display the result
        if (a <= c && c <= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

This Java code preserves the logic of the original COBOL program, including reading input, splitting it into components, converting them to integers, and performing the conditional check. The use of `Scanner` for input and `System.out.println` for output ensures that the program maintains the same input/output behavior as the original COBOL program.