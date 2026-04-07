import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rcnt = 0;
        int bcnt = 0;
        int len = 0;
        int ans = 0;
        int idx = 0;

        while (idx < input.length()) {
            char sa = input.charAt(idx);
            if (sa == '0') {
                rcnt++;
            } else if (sa == '1') {
                bcnt++;
            } else if (sa == ' ') {
                len = idx;
                break;
            }
            idx++;
        }

        if (rcnt > bcnt) {
            ans = len - (rcnt - bcnt);
        } else {
            ans = len - (bcnt - rcnt);
        }

        System.out.println(ans);
    }
}
```

### Explanation of the Code:
1. **Input Handling**: The program reads a string from standard input using `Scanner`.
2. **Initialization**: Variables `rcnt`, `bcnt`, `len`, `ans`, and `idx` are initialized to zero.
3. **Loop Through Input**: A `while` loop iterates through each character of the input string until a space is encountered.
   - If the character is '0', it increments `rcnt`.
   - If the character is '1', it increments `bcnt`.
   - If the character is a space, it sets `len` to the current index and breaks out of the loop.
4. **Calculate Answer**: Depending on whether `rcnt` is greater than or less than `bcnt`, it calculates `ans` accordingly.
5. **Output**: The result is printed to the console.