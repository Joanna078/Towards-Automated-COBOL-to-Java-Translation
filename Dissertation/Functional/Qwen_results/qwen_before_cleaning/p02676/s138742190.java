import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept K
        int k = Integer.parseInt(scanner.nextLine().trim());

        // Accept S
        String s = scanner.nextLine().trim();

        // Split S into words and count them
        String[] words = s.split(" ");
        int len = words.length;

        if (len <= k) {
            // Display trimmed S
            System.out.println(s.trim());
        } else {
            // Display first K characters followed by "..."
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < k; i++) {
                result.append(words[i]);
                if (i < k - 1) {
                    result.append(" ");
                }
            }
            result.append("...");
            System.out.println(result.toString());
        }

        scanner.close();
    }
}
```

### Explanation of the Code:
1. **Input Handling**: The `Scanner` class is used to read input from the user.
2. **Splitting the String**: The string `S` is split into words using the `split(" ")` method.
3. **Conditional Logic**:
   - If the number of words (`len`) is less than or equal to `k`, the entire string is printed after trimming.
   - Otherwise, the first `k` words are concatenated with spaces in between, and then "...” is appended at the end.
4. **Output**: The result is printed to the console.