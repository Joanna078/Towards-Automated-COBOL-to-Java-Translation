import java.util.Scanner;

public class ABC_076_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Initialize variables
        long board = 1;
        StringBuilder ans = new StringBuilder();
        String ZS = "";

        // Perform loop
        for (int i = 1; i <= N; i++) {
            board = Math.min(board * 2, board + K);
        }

        // Convert board to string
        ZS = Long.toString(board);

        // Unstring operation
        for (char c : ZS.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }

        // Output result
        System.out.println(ans.toString());

        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` statements with `Scanner` for reading input from the console.
2. **Data Types**: Changed `PIC 9(11)` to `long` for `board`, `N`, and `K`. Used `StringBuilder` for `ans`.
3. **Loop**: Replaced `PERFORM VARYING` with a traditional `for` loop.
4. **Math Operations**: Replaced `COMPUTE` and `FUNCTION MIN` with `Math.min`.
5. **String Manipulation**: Replaced `UNSTRING` with a simple loop to remove spaces from `ZS`.
6. **Output**: Replaced `DISPLAY` with `System.out.println`.

This Java code maintains the original logic and behavior of the COBOL program while adhering to modern Java practices.