import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input handling
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers separated by space:");
        String input = scanner.nextLine();
        scanner.close();

        // Splitting input into two parts
        String[] parts = input.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid input format");
            return;
        }

        // Parsing input parts
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        // Determining class based on the number
        int classA = determineClass(a);
        int classB = determineClass(b);

        // Comparing classes and displaying result
        if (classA == classB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /**
     * Determines the class of a given number.
     *
     * @param num The number to classify.
     * @return The class of the number.
     */
    private static int determineClass(int num) {
        switch (num) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 1;
            case 4:
            case 6:
            case 9:
            case 11:
                return 2;
            case 2:
                return 3;
            default:
                throw new IllegalArgumentException("Invalid number: " + num);
        }
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program while adhering to modern Java 17 standards. It includes input handling, parsing, classification using a `switch` statement, and output display.