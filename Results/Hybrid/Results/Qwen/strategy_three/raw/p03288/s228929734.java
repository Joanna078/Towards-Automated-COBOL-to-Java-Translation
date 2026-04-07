```java
public class ABC_104_A {
    public static void main(String[] args) {
        // Check if input is provided
        if (args.length == 0) {
            System.out.println("Please provide an input value.");
            return;
        }

        // Input from user or predefined value
        int r = Integer.parseInt(args[0]);

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