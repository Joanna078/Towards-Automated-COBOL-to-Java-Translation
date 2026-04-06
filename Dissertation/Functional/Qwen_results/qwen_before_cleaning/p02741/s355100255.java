import java.util.Arrays;

public class AKthTerm {
    public static void main(String[] args) {
        // Define the constants from the COBOL program
        final String TABLE = "01010102010201050202010501020114" +
                             "01050105020201150202050401040151";
        
        // Convert the table string into an array of integers
        int[] tblR = Arrays.stream(TABLE.split(""))
                           .mapToInt(Integer::parseInt)
                           .toArray();
        
        // Read the input value K (assuming it's provided as a command-line argument)
        int k = Integer.parseInt(args[0]);
        
        // Retrieve the K-th term from the table
        int out = tblR[k];
        
        // Print the result without leading zeros
        System.out.println(out);
    }
}
```

### Explanation of the Conversion:
1. **Constants**: The `TABLE` string is defined directly in the Java code.
2. **Array Conversion**: The `TABLE` string is split into individual characters, converted to integers, and stored in an array `tblR`.
3. **Input Handling**: The input value `K` is read from the command line arguments.
4. **Retrieving the K-th Term**: The K-th term is retrieved from the `tblR` array.
5. **Output**: The output is printed without leading zeros using `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices and syntax.