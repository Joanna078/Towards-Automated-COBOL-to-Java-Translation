import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define the input string
        String inp = "HelloWorld"; // Replace with actual input

        // Convert input string to character array
        char[] wkTbl = new char[100];
        System.arraycopy(inp.toCharArray(), 0, wkTbl, 0, Math.min(inp.length(), 100));

        // Initialize index variables
        int idx = 0;
        int idx2 = 0;
        int idx3 = 0;

        // Find the first space in the array
        while (idx < wkTbl.length && wkTbl[idx] != ' ') {
            idx++;
        }

        // Calculate idx2 and idx3
        idx2 = idx - 1;
        idx3 = idx - 3;

        // Display the result
        if (idx3 >= 0) {
            System.out.println(wkTbl[0] + Arrays.copyOfRange(wkTbl, idx3, idx2 + 1));
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
```

### Explanation:
1. **Input Handling**: The input string `inp` is converted to a character array `wkTbl`.
2. **Finding the First Space**: A `while` loop iterates through the array until it finds the first space or reaches the end of the array.
3. **Calculating Indices**: `idx2` and `idx3` are calculated based on the position of the first space.
4. **Displaying the Result**: The result is displayed using `System.out.println`. If `idx3` is negative, an error message is printed indicating that the index is out of bounds.