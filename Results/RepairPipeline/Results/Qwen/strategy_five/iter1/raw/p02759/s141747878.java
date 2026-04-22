```java
public class ProgramId {
    public static void main(String[] args) {
        // Input from user or predefined value
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]); // Assuming input is provided as command-line argument

            // Compute the result
            double ans = (double) n / 2 + 0.9;

            // Output the result
            System.out.println(ans);
        } else {
            System.out.println("No input provided.");
        }
    }
}
```