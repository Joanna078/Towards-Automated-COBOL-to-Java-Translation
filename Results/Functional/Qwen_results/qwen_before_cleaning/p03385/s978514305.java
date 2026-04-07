import java.util.Arrays;

public class ABC_093_A {
    public static void main(String[] args) {
        // Input string
        String inp = "abc"; // This should be replaced with actual input handling

        // Initialize variables
        int maxlen = 3;
        int cur = 0;
        int[] abc = new int[3];

        // Process each character in the input string
        while (cur < maxlen && cur < inp.length()) {
            char currentChar = inp.charAt(cur);
            if (currentChar == 'a') {
                abc[0] = 1;
            } else if (currentChar == 'b') {
                abc[1] = 1;
            } else if (currentChar == 'c') {
                abc[2] = 1;
            }
            cur++;
        }

        // Check if all characters were found
        if (Arrays.equals(abc, new int[]{1, 1, 1})) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

### Explanation of Changes:
1. **Data Structure**: Replaced the COBOL `OCCURS` clause with a Java array to store the occurrences of 'a', 'b', and 'c'.
2. **Loop**: Used a `while` loop instead of a `PERFORM` loop to iterate through the input string.
3. **Character Comparison**: Used `charAt` method to access individual characters in the string.
4. **Array Initialization**: Initialized the `abc` array with zeros using `new int[3]`.
5. **Comparison**: Used `Arrays.equals` to check if all elements in the `abc` array are equal to 1.
6. **Input Handling**: The input string is hardcoded here. In a real-world scenario, you would handle input differently, possibly from user input or a file.