import java.util.Scanner;

public class ABC_055_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        
        // Processing section
        int tmpN = n / 15;
        int tmp = 800 * n - tmpN * 200;
        String zs = String.format("%07d", tmp);
        
        // Call to UNANS method
        unans(zs);
        
        // Output section
        System.out.println(ans.substring(0, ans.length()));
    }

    private static String ans = "";

    private static void unans(String zs) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        ans = sb.toString();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to handle user input.
2. **Division Operation**: Used integer division `/` instead of `DIVIDE`.
3. **Formatting**: Used `String.format` to ensure `ZS` is always 7 digits long.
4. **String Manipulation**: Replaced `UNSTRING` with a loop to remove spaces from `zs`.
5. **Modern Java Features**: Used `StringBuilder` for efficient string manipulation.
6. **Code Quality**: Added comments for clarity and used modern Java conventions.