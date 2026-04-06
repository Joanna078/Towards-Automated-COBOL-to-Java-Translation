```java
public class ABC_104_A {
    public static void main(String[] args) {
        // Check if the input is provided
        if (args.length == 0) {
            System.out.println("No input provided");
            return;
        }

        // Input from user or predefined value
        int r = Integer.parseInt(args[0]); // Assuming input is provided as command-line argument

        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}
```