import java.util.Scanner;

public class ABC_105_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = Integer.parseInt(scanner.nextLine());
        
        StringBuilder str = new StringBuilder();
        int p = 0;
        
        // Conversion logic
        while (n != 0) {
            if (n % 2 == 1) {
                str.insert(p++, '1');
                n--;
            } else {
                str.insert(p++, '0');
            }
            n /= -2;
        }
        
        // Reverse string
        String ans = str.reverse().toString();
        
        // Output
        if (ans.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(ans);
        }
    }
}
```

### Explanation of Complex Logic:
1. **Conversion Logic**:
   - The original COBOL program converts a decimal number to its binary representation using base -2.
   - In the Java version, we use a `StringBuilder` to build the binary string from left to right.
   - We insert characters into the `StringBuilder` at position `p`, which is incremented after each insertion.
   - If `n` is odd, we append '1' and subtract 1 from `n`. If `n` is even, we append '0'.
   - After processing all bits, we reverse the `StringBuilder` to get the correct binary representation.

2. **Output Handling**:
   - If the resulting binary string is empty (which happens when `n` is 0), we print "0".
   - Otherwise, we print the reversed binary string.