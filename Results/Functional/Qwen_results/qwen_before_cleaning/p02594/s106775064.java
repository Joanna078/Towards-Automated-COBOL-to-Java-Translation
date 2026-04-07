public class Main {
    public static void main(String[] args) {
        // Define the input variable
        int x = Integer.parseInt(args[0]);

        // Check the condition and print the result
        if (x >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code preserves the logic of the original COBOL program, accepting an integer as input and printing "Yes" if it is greater than or equal to 30, otherwise printing "No". The use of `Integer.parseInt(args[0])` assumes that the input will be provided as a command-line argument when running the program.