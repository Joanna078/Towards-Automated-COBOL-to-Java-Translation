import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String inp = scanner.nextLine();
        
        // Parsing
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);
        
        // Calculation
        int cnt = n / (a + b);
        int outCnt;
        
        if (a == 0) {
            outCnt = 0;
        } else if (b == 0) {
            outCnt = n;
        } else {
            int sumA = a * cnt;
            int sumB = b * cnt;
            
            while (n > sumA + sumB) {
                sumA += a;
                sumB += b;
            }
            
            int bkCnt = sumA + sumB - n;
            if (bkCnt <= b) {
                outCnt = sumA;
            } else {
                outCnt = sumA - (bkCnt - b);
            }
        }
        
        // Output
        System.out.printf("%d%n", outCnt);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read input from the console.
2. **Parsing**: Used `split` method to parse the input string into individual components.
3. **Calculation**: Translated the COBOL logic into Java syntax, using `if-else` statements and loops.
4. **Output**: Used `System.out.printf` to format and print the output.
5. **Java 17 Features**: No specific Java 17 features were used as the original logic was straightforward and did not require advanced language constructs.