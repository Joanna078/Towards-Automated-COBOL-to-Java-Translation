import java.util.Arrays;

public class ABC_066_A {
    public static void main(String[] args) {
        String inp = "12345 67890 54321"; // Simulating input
        String[] parts = inp.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        int tmp = a + b;
        c = Math.max(Math.max(a, b), c);
        c -= tmp;

        StringBuilder zs = new StringBuilder();
        zs.append(c);

        StringBuilder ans = new StringBuilder();
        for (char ch : zs.toString().toCharArray()) {
            if (ch != ' ') {
                ans.append(ch);
            }
        }

        System.out.println(ans.substring(0, ans.length()));
    }
}
```

### Explanation of Changes:
1. **Data Types**: Replaced COBOL data types with appropriate Java data types (`int` for numeric values and `String` for character strings).
2. **Input Handling**: Simulated input handling using a string split method.
3. **String Operations**: Used Java's `split` method to handle string splitting and `StringBuilder` for string manipulation.
4. **Math Functions**: Replaced COBOL's `MAX` function with Java's `Math.max`.
5. **Looping and Conditionals**: Simplified the loop and conditional logic using standard Java constructs.
6. **Output**: Used `System.out.println` to display the result.