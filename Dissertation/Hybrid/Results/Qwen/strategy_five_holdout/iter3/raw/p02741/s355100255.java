```java
import java.util.Arrays;

public class AKthTerm {
    public static void main(String[] args) {
        // Define the constants from the COBOL program
        final String TABLE = "01010102010201050202010501020114" +
                             "01050105020201150202050401040151";
        
        // Convert the table string into an array of integers
        int[] tblR = new int[TABLE.length() / 2]; // Each number is two digits
        for (int i = 0; i < TABLE.length(); i += 2) {
            tblR[i / 2] = Integer.parseInt(TABLE.substring(i, i + 2));
        }
        
        // Read the input value K (assuming it's provided as a command-line argument)
        int k = Integer.parseInt(args[0]) - 1; // Adjust for zero-based indexing
        
        // Retrieve the K-th term from the table
        int out = tblR[k];
        
        // Print the result without leading zeros
        System.out.printf("%d%n", out);
    }
}
```